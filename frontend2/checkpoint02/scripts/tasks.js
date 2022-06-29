const newTask = document.getElementById("novaTarefa");
const newTaskForm = document.querySelector(".nova-tarefa");
const tasks = document.getElementById("tasks");
const doneTasks = document.getElementById("doneTasks");

const logout = document.getElementById("closeApp");

if (localStorage.getItem("jwt") == null || localStorage.getItem("jwt") == "") {
  alert("Você precisa estar logado para acessar essa página!");
  window.location.href = "/index.html";
}

logout.addEventListener("click", () => {
  localStorage.removeItem("jwt");
  alert("Deslogado com sucesso!");
  setTimeout(() => {
    window.location.href = "/index.html";
  }, 1000);
});

newTaskForm.addEventListener("submit", (event) => {
  event.preventDefault();
  if (
    newTask.value !== "" &&
    newTask.value !== null &&
    newTask.value.length >= 5
  ) {
    fetch("https://ctd-todo-api.herokuapp.com/v1/tasks", {
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
        } else if ((res.status = 200)) {
          refreshTasks();
          newTask.value = "";
        }
      })
      .catch((response) => {
        console.log(response);
      });
  } else {
    alert("Task description must not be null.");
  }
});

function refreshTasks() {
  fetch("https://ctd-todo-api.herokuapp.com/v1/tasks", {
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
          data.forEach((element) => {
            if (element.completed == false) {
              let li = document.createElement("li");
              li.classList.add("tarefa");
              li.setAttribute("id", element.id);
              let div = document.createElement("div");
              div.classList.add("not-done");
              div.addEventListener("click", () => {
                fetch(
                  `https://ctd-todo-api.herokuapp.com/v1/tasks/${div.parentNode.id}`,
                  {
                    method: "PUT",
                    headers: {
                      Accept: "*/*, application/json, text/plain",
                      "Content-Type": "application/json",
                      authorization: localStorage
                        .getItem("jwt")
                        .replace(/"/g, ""),
                    },
                    body: {
                      description: element.description,
                      completed: true,
                    },
                  }
                ).then((resposta) => {
                  if (!resposta.ok) {
                    throw Error(resposta);
                  } else {
                    resposta.json().then((dados) => {
                      div.classList.remove("not-done");
                      doneTasks.appendChild(div.parentNode);
                      console.log(dados);
                    });
                  }
                });
              });
              let altDiv = document.createElement("div");
              let pDesc = document.createElement("p");
              let pDate = document.createElement("p");
              let description = document.createTextNode(element.description);
              let timeStamp = document.createTextNode(element.createdAt);
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
              doneDiv.classList.add("done");
              pDesc = document.createElement("p");
              description = document.createTextNode(element.description);
              pDesc.appendChild(description);
              pDesc.classList.add("nome");
              doneDiv.insertAdjacentElement("afterbegin", pDesc);
              doneLi.insertAdjacentElement("afterbegin", doneDiv);

              doneTasks.appendChild(doneLi);
            }
          });
        });
      }
    })
    .catch((err) => {
      alert("No tasks found, create one or contact admin");
    });
}

refreshTasks();
