const email = document.getElementById("inputEmail");
const senha = document.getElementById("inputPassword");
const loginForm = document.getElementById("form");
const errorMessage = document.getElementById("errorMessage");
const button = document.getElementById('submit');

var validEmail = false;
var validPass = false;

button.setAttribute('disabled', 'disabled');

function isValidEmail(email) {
  return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(
    email
  );
}

function checkEmail() {
  let errorElement = document.getElementById('emailError');
  let errorMessage = [];

  if (email.value == '' || email.value == null) { 
    errorMessage.push('This field is required');
    errorElement.innerText = errorMessage;
    email.style.setProperty('border', 'red 2px solid');
    validEmail = false;
    return false;                         
  } else if (!isValidEmail(email.value)) {
    errorMessage.push('Please, type a valid email'); 
    errorElement.innerText = errorMessage;
    email.style.setProperty('border', 'red 2px solid');
    validEmail = false;
    return false;
  } else {
    email.style.setProperty("border", "green 2px solid");
    if (errorElement.length != 0) {
      errorElement.innerText = "";
    }
    validEmail = true;
    return true;
  }
}

function checkPassword() {
  let errorElement = document.getElementById('passError');
  let errorMessage = [];

  if (senha.value == '' || senha.value == null) {
    errorMessage.push("This field is required");
    errorElement.innerText = errorMessage;
    senha.style.setProperty("border", "red 2px solid");
    validPass = false;
    return false;
  } else {
    if (errorElement.length != 0) {
      errorElement.innerText = "";
    }
    senha.style.setProperty("border", "green 2px solid");
    validPass = true;
    return true;
  }
}

email.addEventListener('keyup', () => {
  validEmail = checkEmail();
})

senha.addEventListener('keyup', () => {
  validPass = checkPassword();
})

function isAllFieldsValid() { 
  return validEmail && validPass;
}

document.addEventListener('keyup', function() {
  if (isAllFieldsValid()) { 
    button.removeAttribute('disabled');
  } else { 
    button.setAttribute('disabled', 'disabled')
  }
})

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
    console.log(res);
    var resposta = JSON.stringify(res.statusText);
    console.log(resposta)
    console.log("Not Found")
    console.log(resposta === `Not Found`);
    
    if (resposta === `"Not Found"`) { 
      errorMessage.innerText = `Usuário não encontrados`
    }
    else if (resposta === `"Bad Request"`) { 
      errorMessage.innerText = `Usuário ou senha incorretos`
    }

    if (!res.ok) { 
      throw Error(res);
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

      setTimeout(href, 1000)
    }
  })
  .catch((err) => {
    email.style.setProperty('border', 'red 2px solid');
    senha.style.setProperty('border', 'red 2px solid');
  })
})