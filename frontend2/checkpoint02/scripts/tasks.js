const newTask = document.getElementById('novaTarefa')
const newTaskForm = document.querySelector('.nova-tarefa')
const tasks = document.getElementById('tasks')
const taskDone = document.querySelectorAll('.not-done')

const logout = document.getElementById('closeApp')

if (localStorage.getItem('jwt') == null || localStorage.getItem('jwt') == '') {
  alert('Você precisa estar logado para acessar essa página!')
  window.location.href = '/index.html'
}

logout.addEventListener('click', () => {
  localStorage.removeItem('jwt')
  alert('Deslogado com sucesso!')
  setTimeout(() => {
    window.location.href = '/index.html'
  }, 1000)
})

newTaskForm.addEventListener('submit', event => {
  event.preventDefault()
  if (newTask.value !== '' && newTask.value !== null) {
    fetch('https://ctd-todo-api.herokuapp.com/v1/tasks', {
      method: 'POST',
      headers: {
        Accept: '*/*, application/json, text/plain',
        'Content-Type': 'application/json',
        authorization: localStorage.getItem('jwt').replace(/"/g, '')
      },
      body: JSON.stringify({
        description: `${newTask.value}`,
        completed: 'false'
      })
    })
      .then(res => {
        if (!res.ok) {
          throw Error(res.statusText)
        } else if ((res.status = 200)) {
          //   tasks.innerHTML += `<li class="tarefa">
          // <div class="not-done">
          // </div>
          // <div class="descricao">
          // <p class="nome">${newTask.value}</p>
          // <p class="timestamp">Criada em: ${res.body.createdAt}</p></div>`
          refreshTasks()
        }
      })
      .catch(response => {
        console.log(response)
      })
  } else {
    alert('Task description must not be null.')
  }
})

var arrayTask = []

function addTask() {
  if (newTask.value) {
    arrayTask.push({
      description: newTask.value,
      completed: false
    })
  } else {
    alert('digite uma tarefa')
  }
  newTask.value = ''
  showTask()
}

function showTask() {
  let newLi = ''
  arrayTask.forEach((task, index) => {
    newLi = `<li class="tarefa">
      <div class="not-done">
      </div>
      <div class="descricao">
      <p class="nome">${task.description}</p>
      <p class="timestamp">Criada em: ${new Date().toLocaleDateString()}</p></div>`
  })

  tasks.innerHTML += newLi
}

function refreshTasks() {
  fetch('https://ctd-todo-api.herokuapp.com/v1/tasks', {
    method: 'GET',
    headers: {
      Accept: '*/*, application/json, text/plain',
      'Content-Type': 'application/json',
      authorization: localStorage.getItem('jwt').replace(/"/g, '')
    }
  }).then(response => {
    // status: 200
    response.json().then(data => {
      data.forEach(element => {
        let li = document.createElement('li')
        li.classList.add('tarefa')
        let div = document.createElement('div')
        div.classList.add('not-done')
        let altDiv = document.createElement('div')
        let pDesc = document.createElement('p')
        let pDate = document.createElement('p')
        let description = document.createTextNode(element.description)
        let timeStamp = document.createTextNode(element.createdAt)
        pDesc.appendChild(description)
        pDate.appendChild(timeStamp)
        pDesc.classList.add('nome')
        pDate.classList.add('timestamp')
        altDiv.classList.add('descricao')
        altDiv.insertAdjacentElement('afterbegin', pDesc)
        altDiv.insertAdjacentElement('beforeend', pDate)
        li.insertAdjacentElement('afterbegin', div)
        li.insertAdjacentElement('beforeend', altDiv)
        tasks.appendChild(li)
      })
    })
  })
}