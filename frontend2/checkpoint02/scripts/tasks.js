const newTask = document.getElementById("novaTarefa");
const newTaskForm = document.querySelector(".nova-tarefa");
const tasks = document.getElementById("tasks");
const doneTasks = document.getElementById("doneTasks");
const logout = document.getElementById("closeApp");
const url = "https://ctd-todo-api.herokuapp.com/v1";

function timedRedirect(location, time) {
  setTimeout(() => {
    window.location.href = `/${location}.html`;
  }, time);
}

function setUserName() {
  const target = document.getElementById("user-name");
  fetch(`${url}/users/getMe`, {
    method: "GET",
    headers: {
      Accept: "*/*, application/json, text/plain",
      "Content-Type": "application/json",
      authorization: localStorage.getItem("jwt").replace(/"/g, ""),
    },
  }).then((response) => {
    response.json().then((data) => {
      target.innerText = data.firstName + " " + data.lastName;
    });
  });
}

if (localStorage.getItem("jwt") == null || localStorage.getItem("jwt") == "") {
  Swal.fire({
    icon: "error",
    title: "Oops...",
    text: "You must be logged in to view this page",
  }).then((result) => {
    timedRedirect("signup", 1);
  });
}

logout.addEventListener("click", () => {
  localStorage.removeItem("jwt");
  Swal.fire({
    icon: "success",
    title: "Logout success",
    showConfirmButton: false,
    timer: 1500,
  });
  timedRedirect("index", 1500);
});

newTaskForm.addEventListener("submit", (event) => {
  event.preventDefault();
  if (
    newTask.value !== "" &&
    newTask.value !== null &&
    newTask.value.length >= 5
  ) {
    fetch(`${url}/tasks`, {
      method: "POST",
      headers: {
        Accept: "*/*, application/json, text/plain",
        "Content-Type": "application/json",
        authorization: localStorage.getItem("jwt").replace(/"/g, ""),
      },
      body: JSON.stringify({
        description: `${newTask.value}`,
        completed: "false",
      }),
    })
      .then((res) => {
        if (!res.ok) {
          throw Error(res.statusText);
        } else if (res.status == 201) {
          newTask.value = "";
        } else if (res.status == 400) {
          Swal.fire({
            icon: "error",
            title: "Oops...",
            text: "Some of required data is insufficient",
          });
        } else if (res.status == 401) {
          Swal.fire({
            icon: "error",
            title: "Oops...",
            text: "Looks like you are not logged in",
          }).then(() => {
            timedRedirect("index", 1);
          });
        } else if (res.status == 500) {
          Swal.fire({
            icon: "error",
            title: "Oops...",
            text: "Internal Error. Please contact admin or try again later",
          });
        }
        window.location.reload();
      })
      .catch((err) => {
        console.error(err.statusText);
      });
  } else {
    Swal.fire({
      icon: "warning",
      title: "Oops...",
      text: "Task description must not be null or have at least 5 characters long",
    }).then(() => {
      newTask.value = "";
    });
  }
});

function refreshTasks() {
  fetch(`${url}/tasks`, {
    method: "GET",
    headers: {
      Accept: "*/*, application/json, text/plain",
      "Content-Type": "application/json",
      authorization: localStorage.getItem("jwt").replace(/"/g, ""),
    },
  })
    .then((response) => {
      if (!response.ok) {
        throw Error(response);
      } else {
        response.json().then((data) => {
          if (!document.getElementById(data.id)) {
            data.forEach((element) => {
              if (element.completed == false) {
                let li = document.createElement("li");
                li.classList.add("tarefa");
                li.setAttribute("id", element.id);
                let div = document.createElement("div");
                div.classList.add("not-done");
                div.addEventListener("click", () => {
                  fetch(`${url}/tasks/${div.parentNode.id}`, {
                    method: "PUT",
                    mode: "cors",
                    headers: {
                      "Access-Control-Allow-Origin": "*",
                      Accept: "*/*, application/json, text/plain",
                      "Content-Type": "application/json",
                      authorization: localStorage
                        .getItem("jwt")
                        .replace(/"/g, ""),
                    },
                    body: JSON.stringify({
                      description: `${element.description}`,
                      completed: "true",
                    }),
                  }).then((resposta) => {
                    if (!resposta.ok) {
                      throw Error(resposta);
                    } else {
                      resposta.json().then(() => {
                        window.location.reload();
                      });
                    }
                  });
                });
                let altDiv = document.createElement("div");
                let pDesc = document.createElement("p");
                let pDate = document.createElement("p");
                let description = document.createTextNode(element.description);
                let timeStamp = document.createTextNode(
                  dayjs(element.createAt).format("DD/MM/YY-HH:mm")
                );

                pDesc.appendChild(description);
                pDate.appendChild(timeStamp);
                pDesc.classList.add("nome");
                pDate.classList.add("timestamp");
                altDiv.classList.add("descricao");
                altDiv.insertAdjacentElement("afterbegin", pDesc);
                altDiv.insertAdjacentElement("beforeend", pDate);
                li.insertAdjacentElement("afterbegin", div);
                li.insertAdjacentElement("beforeend", altDiv);
                tasks.appendChild(li);
              } else if (element.completed == true) {
                let doneLi = document.createElement("li");
                doneLi.classList.add("tarefa");
                doneLi.setAttribute("id", element.id);
                let doneDiv = document.createElement("div");
                doneDiv.classList.add("descricao");
                pDesc = document.createElement("p");
                description = document.createTextNode(element.description);
                pDesc.appendChild(description);
                pDesc.classList.add("nome");
                doneDiv.insertAdjacentElement("afterbegin", pDesc);
                doneLi.insertAdjacentElement("afterbegin", doneDiv);
                let undoButton = document.createElement("i");
                undoButton.classList.add("fa-solid");
                undoButton.classList.add("fa-arrow-rotate-left");
                let rightDiv = document.createElement("div");
                doneDiv.insertAdjacentElement("beforeend", rightDiv);
                let deleteButton = document.createElement("i");
                deleteButton.classList.add("fa-solid");
                deleteButton.classList.add("fa-trash-can");
                rightDiv.insertAdjacentElement("beforeend", undoButton);
                rightDiv.insertAdjacentElement("beforeend", deleteButton);
                deleteButton.addEventListener("click", () => {
                  const deleteLi =
                    deleteButton.parentNode.parentNode.parentNode;
                  fetch(
                    `https://ctd-todo-api.herokuapp.com/v1/tasks/${deleteLi.id}`,
                    {
                      method: "DELETE",
                      mode: "cors",
                      headers: {
                        "Access-Control-Allow-Origin": "*",
                        Accept: "*/*, application/json, text/plain",
                        "Content-Type": "application/json",
                        authorization: localStorage
                          .getItem("jwt")
                          .replace(/"/g, ""),
                      },
                    }
                  );
                  deleteLi.remove();
                });
                undoButton.addEventListener("click", () => {
                  const undoneLi = undoButton.parentNode.parentNode.parentNode;
                  fetch(
                    `https://ctd-todo-api.herokuapp.com/v1/tasks/${undoneLi.id}`,
                    {
                      method: "PUT",
                      mode: "cors",
                      headers: {
                        "Access-Control-Allow-Origin": "*",
                        Accept: "*/*, application/json, text/plain",
                        "Content-Type": "application/json",
                        authorization: localStorage
                          .getItem("jwt")
                          .replace(/"/g, ""),
                      },
                      body: JSON.stringify({
                        description: `${element.description}`,
                        completed: "false",
                      }),
                    }
                  ).then((respost) => {
                    if (!respost.ok) {
                      throw Error(respost);
                    } else {
                      respost.json().then(() => {
                        window.location.reload();
                      });
                    }
                  });
                });
                doneTasks.appendChild(doneLi);
              }
            });
          }
        });
      }
    })
    .catch((err) => {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Could not retrieve data, please contact admin",
        footer: `${err.status + ":" + err.statusText}`,
      }).then(() => {
        timedRedirect("index", 10);
      });
    });
}

window.onload = () => {
  setUserName();
  refreshTasks();
};