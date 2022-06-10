const username = document.getElementById("name");
const password = document.getElementById("pass");
const telephone = document.getElementById("tel");
const button = document.getElementById("button");
const form = document.getElementById("form");
const hobbiesNetflix = document.getElementById("hobbiesNetflix");
const hobbiesSoccer = document.getElementById("hobbiesSoccer");
const hobbiesTennis = document.getElementById("hobbiesTennis");
const hobbiesGym = document.getElementById("hobbiesGym");
const hobbiesVideoGame = document.getElementById("hobbiesVideoGame");
const hobbiesCooking = document.getElementById("hobbiesCooking");
const hobbiesProgramming = document.getElementById("hobbiesProgramming");
const hobbiesDrawing = document.getElementById("hobbiesDrawing");
const hobbiesPainting = document.getElementById("hobbiesPainting");
const hobbiesGuitar = document.getElementById("hobbiesGuitar");
const hobbiesKeyboard = document.getElementById("hobbiesKeyboard");
const hobbiesSewing = document.getElementById("hobbiesSewing");
const hobbiesReading = document.getElementById("hobbiesReading");
const hobbiesWriting = document.getElementById("hobbiesWriting");

function isValidName(name) {
  return /^[a-zA-Z]+(?:\s[a-zA-Z]+)+$/.test(name);
}

function insertAfter(newNode, referenceNode) {
  referenceNode.parentNode.insertBefore(newNode, referenceNode.nextSibling);
}

function checkUsername() {
  let errorElement = document.getElementById("errorName");
  let errorMessage = [];
  
  if (username.value.trim() === "" || username.value == null) {
    errorMessage.push("This field is required");
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  } else if (username.value.length > 150) {
    errorMessage.push("This field should not exceed 150 characters");
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  } else if (!isValidName(username.value)) {
    errorMessage.push(
      "There should be at least two words, with one letter each and no numbers"
    );
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  
  username.style.setProperty('border', 'green 2px solid');
  let failIcon = document.getElementById('failName');
  let successIcon = document.getElementById('successName');
  
  successIcon.style.visibility = 'visible';
  failIcon.style.visibility = 'hidden';

  if (errorElement.length != 0) {
    errorElement.innerText = '';
  }
  return true;
}

function checkPassword() {
  let errorElement = document.getElementById("errorPass");
  let errorMessage = [];

  if (password.value.search(/[a-z]/) < 0) {
    errorMessage.push(
      "Your password must contain at least one lowercase letter"
    );
  }
  if (password.value.search(/[A-Z]/) < 0) {
    errorMessage.push(
      "Your password must contain at least one uppercase letter"
    );
  }
  if (password.value.search(/[0-9]/) < 0) {
    errorMessage.push("Your password must contain at least one digit");
  }
  if (password.value.search(/[\!\@\#\$\%\^\&\*\(\)\_\+\.\,\;\:\-]/) < 0) {
    errorMessage.push(
      "Your password must contain at least one special character"
    );
  }

  if (errorMessage.length > 0) {
    errorElement.innerHTML = errorMessage.join("<br>");
    errorElement.classList.add("wrong");
    window.scrollTo(0, 0);
    return false;
  }
  password.style.setProperty('border', 'green 2px solid');
  let label = document.getElementById('labelPass');
  username.style.setProperty('border', 'green 2px solid');
  let icon = document.createElement('i');
  icon.classList.add('fa-solid', 'fa-circle-check');
  label.appendChild(icon);
  if (errorElement.length != 0) {
    errorElement.innerText = '';
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
  let errorElement = document.getElementById("errorHobbies");
  let errorMessage = [];

  if (isChecked(hobbiesVideoGame) && isChecked(hobbiesCooking)) {
    errorMessage.push("Video Game + Cooking is not allowed");
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  if (isChecked(hobbiesGuitar) && isChecked(hobbiesReading)) {
    errorMessage.push("Guitar + Reading is not allowed");
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  if (isChecked(hobbiesNetflix) && isChecked(hobbiesSewing)) {
    errorMessage.push("Netflix + Sewing is not allowed");
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    window.scrollTo(0, 0);
    return false;
  }
  return true;
}

function checkedHobby() {
  let errorElement = document.getElementById("errorHobbies");
  let errorMessage = [];
  let hobbies = document.getElementsByName("hobbies");
  var checkedHobbies = [];
  hobbies.forEach((value, index) => {
    if (value.checked) {
      checkedHobbies.push(index);
    }
  });
  if (checkedHobbies.length >= 5) {
    errorMessage.push("Please, only check 4 boxes");
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    return false;
  } else {
    return true;
  }
}

function checkCountry() {
  let errorElement = document.getElementById("errorCountry");
  let errorMessage = [];
  let brazil = document.getElementById("brazil");
  if (brazil.checked) {
    errorMessage.push(
      "Sorry, currently we are not recruting wizards from Brazil."
    );
    errorElement.classList.add("wrong");
    errorElement.innerText = errorMessage;
    return false;
  } else {
    return true;
  }
}

form.addEventListener("submit", (event) => {
  if (!checkUsername()) {
    let failIcon = document.getElementById('failName');
    let successIcon = document.getElementById('successName');
    username.style.setProperty('border', 'red 2px solid');
    successIcon.style.visibility = 'hidden';
    failIcon.style.visibility = 'visible';
    event.preventDefault();
  } else if (!checkPassword()) {
    password.style.setProperty('border', 'red 2px solid');
    event.preventDefault();
  } else if (!checkHobbies()) {
    event.preventDefault();
  } else if (!checkedHobby()) {
    event.preventDefault();
  } else if (!checkCountry()) {
    event.preventDefault();
  }
});

window.addEventListener("load", () => {
  Element.prototype.setAttributes = function (attrs) {
    for (var idx in attrs) {
      if ((idx === "styles" || idx === "style") &&typeof attrs[idx] === "object") {
        for (var prop in attrs[idx]) {this.style[prop] = attrs[idx][prop];}
      } else if (idx === "html") {
        this.innerHTML = attrs[idx];
      } else {
        this.setAttribute(idx, attrs[idx]);
      }
    }
  };

  let div = document.createElement('div');
  let img = document.createElement('img');
  let h1 = document.querySelector('h1');
  div.classList.add('logo');
  img.setAttributes({
  'src' : 'https://i.pinimg.com/originals/0a/41/0e/0a410e3a4f03610eed0dbbbcd2f0a3db.png',
  'alt' : 'logo'});
  div.appendChild(img);
  h1.parentNode.insertBefore(div, h1);
});