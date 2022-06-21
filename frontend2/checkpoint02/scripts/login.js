const email = document.getElementById("inputEmail");
const senha = document.getElementById("inputPassword");
const loginForm = document.getElementById("form");
const errorMessage = document.getElementById("errorMessage");

loginForm.addEventListener("submit", (event) => {
  event.preventDefault();
  fetch("https://ctd-todo-api.herokuapp.com/v1/users/login", {
    method: "POST",
    headers: {
      Accept: "*/* , application/json, text/plain",
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      email: `${email.value}`,
      password: `${senha.value}`,
    }),
  })
  .then((res) => {
    if (!res.ok) { 
      throw Error(res.statusText);
    }
    else { 
      res.json() 
      console.log(res)
      errorMessage.innerText = 'Login efetuado com sucesso!'
      email.style.setProperty('border', 'green 2px solid');
      senha.style.setProperty('border', 'green 2px solid'); 
      
      function href() { 
        window.location.href = '/tarefas.html'
      }

      setTimeout(href, 100000)
    }
  })
  .catch(() => {
    errorMessage.innerText = `Usuário não encontrado`
    email.style.setProperty('border', 'red 2px solid');
    senha.style.setProperty('border', 'red 2px solid');    
  })
})



// function fetchAPI() {
//   fetch("https://ctd-todo-api.herokuapp.com/v1/users/login", {
//     method: "POST",
//     headers: {
//       Accept: "*/* , application/json, text/plain",
//       "Content-Type": "application/json",
//     },
//     body: JSON.stringify({
//       email: `${email.value}`,
//       password: `${senha.value}`,
//     }),
//   })
//     .then((res) => res.json())
//     .then((data) => console.log(data));
//   return true;
// }

// loginForm.addEventListener("submit", (event) => {
//   if (fetchAPI()) {
//     window.location.href = '/tarefas.html'
//   }
//   else { 
//     errorMessage.innerText = 'Conta não encontrada'
//     email.style.setProperty('border', 'red 2px solid');
//     senha.style.setProperty('border', 'red 2px solid');    
//   }
// });








// loginForm.onsubmit = async event => {
//     event.preventDefault()
//     var data = new FormData(loginForm);
//     let response = await fetch('https://https://ctd-todo-api.herokuapp.com/v1/users/login', {
//       method: 'POST',
//       headers: {
//         Accept: '*/*, application/json',
//         'Content-Type': 'application/json'
//       },
//       body: data
//     })
//     console.log(data);

//     let result = await response.json()

//     alert(result.message)
// }
