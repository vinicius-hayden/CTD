const lista = document.querySelector("#lista");
const url = "https://jsonplaceholder.typicode.com/users";

fetch(url)
  .then((Response) => Response.json())
  .then((Data) => {
    console.log(Data);
    return Data.map((user) => {
      // console.log(user.name);
      let li = document.createElement("li");
      li.innerHTML = `${user.name} (${user.username})`;
      lista.appendChild(li);
    });
  })
  .catch((err) => {
    document.write("Error 404 " + err);
  });
