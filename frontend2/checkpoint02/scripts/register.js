// VARIÁVEIS GLOBAIS //

var validName = false
var validSecondName = false
var validEmail = false
var validPass = false

// CONSTANTES GLOBAIS //

const nome = document.getElementById('nome')
const sobrenome = document.getElementById('sobrenome')
const email = document.getElementById('email')
const senha = document.getElementById('senha')
const reSenha = document.getElementById('repassword')
const form = document.getElementsByName('button')

// REGISTER LOGIC //

function checkName() {
  
  function isValidName(name) {
    return /^[a-zA-Z]+(?:\s[a-zA-Z]+)+$/.test(name);
  }

  let errorElement = document.getElementById("nameError");
  let errorMessage = [];
  if (nome.value.trim() === "" || nome.value == null) {
    errorMessage.push("This field is required");
    errorElement.innerText = errorMessage;
    return false;
  // } else if (nome.value.length > 150) {
  //   errorMessage.push("This field should not exceed 150 characters");
  //   errorElement.innerText = errorMessage;
  //   return false;
  } else if (!isValidName(nome.value)) {
    errorMessage.push(
      "There should be at least two words, with one letter each and no numbers"
    );
    errorElement.innerText = errorMessage;
    return false;
  } 
}

document.addEventListener('keydown', event => {
  // VALIDAÇÃO DE DADOS
  // caso dado seja válido, utilizar variável global setando para true.
  if(!checkName()) { 
    nome.style.setProperty('border', 'red 2px solid');
    validName = false;
    // event.preventDefault();
  }
  else {
    nome.style.setProperty('border', 'green 2px solid');
    validName = true;
  }
  

})

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
