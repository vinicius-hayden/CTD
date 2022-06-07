const username = document.getElementById('name');
const password = document.getElementById('pass');
const telephone = document.getElementById('tel');
const button = document.getElementById('button');
const form = document.getElementById('form');
const errorElement = document.getElementById('error');

form.addEventListener('submit', (e) => {
  let messages = [];
  if (username.value === '' || username.value == null) { 
    messages.push('Name is required.')
  }

  if (username.value != /^[a-zA-Z ]+$/) {
    messages.push('Name should contain at least two words')
  }


  if (messages.length > 0) {
    e.preventDefault();
    errorElement.innerText = messages.join(', ')

  }

})
