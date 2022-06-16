// Login

function fetchAPI() { 
  fetch('https://ctd-todo-api.herokuapp.com/v1/users/login', {
    method: 'POST', 
    headers: { 
      'Accept': '*/* , application/json, text/plain',
      'Content-Type': 'application/json'
    }, 
    body: JSON.stringify({
      "email": "johnsilva@gmail.com",
      "password": "password123"
    })
  })
  .then(res => res.json())
  .then(data => console.log(data))
}