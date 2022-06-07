const button = document.querySelector("button");
const body = document.body;

window.onload = function () {
  button.addEventListener("click", () => {
    function fetchAPI() {
      fetch("https://dummyjson.com/products/1").then((response) => {
        response.json().then((data) => {
          const div = document.createElement("div");
          const p = document.createElement("p");
          const h3 = document.createElement("h3");
          const img = document.createElement("img");
  
          div.innerHTML += `<h1> ${data.title} </h1>`;
          p.innerHTML = data.description;
          h3.innerHTML = data.price;
          img.setAttribute("src", data.thumbnail);
  
          body.appendChild(div);
          div.appendChild(img);
          div.appendChild(p);
          div.appendChild(h3);
        });
      });
    }
    fetchAPI();
  });
}

button.style = `
  border: none;
  border-radius: 5px;
  padding: 10px;
  cursor: pointer;
`