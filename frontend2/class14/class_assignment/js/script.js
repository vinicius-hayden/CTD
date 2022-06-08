const username = document.getElementById("name");
const password = document.getElementById("pass");
const telephone = document.getElementById("tel");
const button = document.getElementById("button");
const form = document.getElementById("form");
const hobbiesNetflix = document.getElementById('hobbiesNetflix');
const hobbiesSoccer = document.getElementById('hobbiesSoccer');
const hobbiesTennis = document.getElementById('hobbiesTennis');
const hobbiesGym = document.getElementById('hobbiesGym');
const hobbiesVideoGame = document.getElementById('hobbiesVideoGame');
const hobbiesCooking = document.getElementById('hobbiesCooking');
const hobbiesProgramming = document.getElementById('hobbiesProgramming');
const hobbiesDrawing = document.getElementById('hobbiesDrawing');
const hobbiesPainting = document.getElementById('hobbiesPainting');
const hobbiesGuitar = document.getElementById('hobbiesGuitar');
const hobbiesKeyboard = document.getElementById('hobbiesKeyboard');
const hobbiesSewing = document.getElementById('hobbiesSewing');
const hobbiesReading = document.getElementById('hobbiesReading');
const hobbiesWriting = document.getElementById('hobbiesWriting');

function isValidName(name) {
  return /^[a-zA-Z]+(?:\s[a-zA-Z]+)+$/.test(name);
}

function checkUsername() {
  let errorElement = document.getElementById("errorName");
  let errorMessage = [];

  if (username.value.trim() === '' || username.value == null) {
    errorMessage.push('This field is required');
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  else if (username.value.length > 150) {
    errorMessage.push('This field should not exceed 150 characters');
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  else if (!isValidName(username.value)) {
    errorMessage.push('There should be at least two words, with one letter each and no numbers');
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  return true;
}

function checkPassword() {
  let errorElement = document.getElementById("errorPass");
  let errorMessage = [];

  if (password.value.search(/[a-z]/) < 0) {
    errorMessage.push("Your password must contain at least one lowercase letter.");
  }
  if (password.value.search(/[A-Z]/) < 0) {
    errorMessage.push("Your password must contain at least one uppercase letter.");
  }
  if (password.value.search(/[0-9]/) < 0) {
    errorMessage.push("Your password must contain at least one digit.")
  }
  if (password.value.search(/[\!\@\#\$\%\^\&\*\(\)\_\+\.\,\;\:\-]/) < 0) {
    errorMessage.push("Your password must contain at least one special character.");
  }

  if (errorMessage.length > 0) {
    errorElement.innerHTML = errorMessage.join('<br>')
    errorElement.classList.add('wrong');
    window.scrollTo(0, 0);
    return false;
  }
  return true;
}

function isChecked(checkbox) {
  if (checkbox.checked) {
    return true;
  } else {
    return false;
  }
}

function checkHobbies() {
  let errorElement = document.getElementById('errorHobbies');
  let errorMessage = []; 

  if (isChecked(hobbiesVideoGame) && isChecked(hobbiesCooking)) {
    errorMessage.push('This combination is not allowed')
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  if (isChecked(hobbiesGuitar) && isChecked(hobbiesReading)) {
    errorMessage.push('This combination is not allowed')
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  if (isChecked(hobbiesNetflix) && isChecked(hobbiesSewing)) {
    errorMessage.push('This combination is not allowed');
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    errorMessage.push('This combination is not allowed');
    return false;
  }
  return true;
}

function checkedHobby() {
  let errorElement = document.getElementById('errorCountry');
  let errorMessage = [];
  let hobbies = document.getElementsByName('hobbies');
  var checkedHobbies = [];

  hobbies.forEach((value, index) => {
    index.addEventListener('change', () => {
      if(value.checked) {
        checkedHobbies.push(index)
      } else{
        console.log('Not checked!');
      }
    })
  })

  if (checkedHobbies.length > 4) {
    errorMessage.push('Please, only check 4 boxes');
    errorElement.classList.add('wrong');
    errorElement.innerText = errorMessage;
    return false;
  } else {
    return true;
  }
}


form.addEventListener("submit", (event) => {
  if (!checkUsername()) {
    event.preventDefault();
  }
  else if (!checkPassword()) {
    console.log("HELLO")
    event.preventDefault();
  }
  else if (!checkHobbies()) {
    event.preventDefault();
  }
  else if(!checkedHobby()) {
    event.preventDefault();
  }
});
