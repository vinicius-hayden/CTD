// CONSTANTES GLOBAIS //

const nome = document.getElementById("nome");
const sobrenome = document.getElementById("sobrenome");
const email = document.getElementById("email");
const senha = document.getElementById("password");
const reSenha = document.getElementById("repassword");
const form = document.getElementsByName("button");

// VARIÁVEIS GLOBAIS //

var validName = false;
var validLastname = false;
var validEmail = false;
var validPass = false;

// REGISTER LOGIC //

function isValidName(name) {
  return /^[a-zA-Z]/.test(name);
}

function isValidEmail(email) {
  return /\S+@\S+\.\S+/.test(email);
}

function checkName() {
  let errorElement = document.getElementById("nameError");
  let errorMessage = [];

  if (nome.value.trim() === "" || nome.value == null) {
    errorMessage.push("This field is required");
    errorElement.innerText = errorMessage;
    nome.style.setProperty("border", "red 2px solid");
    validName = false;
    return false;
  } else if (nome.value.length > 150) {
    errorMessage.push("This field should not exceed 150 characters");
    errorElement.innerText = errorMessage;
    nome.style.setProperty("border", "red 2px solid");
    validName = false;
    return false;
  } else if (!isValidName(nome.value)) {
    errorMessage.push(
      "There should be at least one word, with one letter each and no numbers"
    );
    errorElement.innerText = errorMessage;
    nome.style.setProperty("border", "red 2px solid");
    validName = false;
    return false;
  } else {
    nome.style.setProperty("border", "green 2px solid");
    if (errorElement.length != 0) {
      errorElement.innerText = "";
    }
    validName = true;
    return true;
  }
}

function checkLastname() {
  let errorElement = document.getElementById("lastnameError");
  let errorMessage = [];

  if (sobrenome.value.trim() === "" || sobrenome.value == null) {
    errorMessage.push("This field is required");
    errorElement.innerText = errorMessage;
    sobrenome.style.setProperty("border", "red 2px solid");
    validLastname = false;
    return false;
  } else if (sobrenome.value.length > 150) {
    errorMessage.push("This field should not exceed 150 characters");
    errorElement.innerText = errorMessage;
    sobrenome.style.setProperty("border", "red 2px solid");
    validLastname = false;
    return false;
  } else if (!isValidName(sobrenome.value)) {
    errorMessage.push(
      "There should be at least one word, with one letter each and no numbers"
    );
    errorElement.innerText = errorMessage;
    sobrenome.style.setProperty("border", "red 2px solid");
    validLastname = false;
    return false;
  } else {
    sobrenome.style.setProperty("border", "green 2px solid");
    if (errorElement.length != 0) {
      errorElement.innerText = "";
    }
    validLastname = true;
    return true;
  }
}

function checkEmail() {
  let errorElement = document.getElementById("emailError");
  let errorMessage = [];

  if (email.value.trim() === "" || email.value == null) {
    errorMessage.push("This field is required");
    errorElement.innerText = errorMessage;
    email.style.setProperty("border", "red 2px solid");
    validEmail = false;
    return false;
  } else if (!isValidEmail(email.value)) {
    errorMessage.push("Please, infor a valid email");
    errorElement.innerText = errorMessage;
    email.style.setProperty("border", "red 2px solid");
    validEmail = false;
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
  let errorElement = document.getElementById("passwordError");
  let errorMessage = [];

  if (senha.value.length < 8) {
    errorMessage.push("Your password must be at least 8 characters");
    errorElement.innerText = errorMessage;
    senha.style.setProperty("border", "red 2px solid");
    validPass = false;
  } else if (senha.value.search(/[a-z]/) < 0) {
    errorMessage.push(
      "Your password must contain at least one lowercase letter."
    );
    errorElement.innerText = errorMessage;
    senha.style.setProperty("border", "red 2px solid");
    validPass = false;
  } else if (senha.value.search(/[A-Z]/) < 0) {
    errorMessage.push(
      "Your password must contain at least one uppercase letter."
    );
    errorElement.innerText = errorMessage;
    senha.style.setProperty("border", "red 2px solid");
    validPass = false;
  } else if (senha.value.search(/[0-9]/) < 0) {
    errorMessage.push("Your password must contain at least one digit.");
    errorElement.innerText = errorMessage;
    senha.style.setProperty("border", "red 2px solid");
    validPass = false;
  } else if (senha.value.search(/[\!\@\#\$\%\^\&\*\(\)\_\+\.\,\;\:\-]/) < 0) {
    errorMessage.push(
      "Your password must contain at least one special character."
    );
    errorElement.innerText = errorMessage;
    senha.style.setProperty("border", "red 2px solid");
    validPass = false;
  } else {
    senha.style.setProperty("border", "green 2px solid");
    if (errorElement.length != 0) {
      errorElement.innerText = "";
    }
    validEmail = true;
    return true;
  }
}

function repeatPassword() { 
  let errorElement = document.getElementById('');
  if(reSenha.value != senha.value) { 
    
  }
}

document.addEventListener("keydown", (event) => {
  // VALIDAÇÃO DE DADOS
  // caso dado seja válido, utilizar variável global setando para true.
  if (checkName()) {
    validName = true;
  }
  if (checkLastname()) {
    validLastname = true;
  }
  if (checkEmail()) {
    validEmail = true;
  }
  if (checkPassword()) {
    validPass = true;
  }
});

// Implementar lógica:
// if "variáveisGlobais" = true
// onclick no button register = createUser()

// const createUser = () => {
//   fetch('https://ctd-todo-api.herokuapp.com/v1/users', {
//     method: 'POST',
//     headers: {
//       Accept: '*/*, application/json',
//       'Content-Type': 'application/json'
//     },
//     body: JSON.stringify({
//       firstName: `${nome.value}`,
//       lastName: `${sobrenome.value}`,
//       email: `${email.value}`,
//       password: `${senha.value}`
//     })
//   })
//     .then(res => res.json())
//     .then(res => console.log(res))
// }
