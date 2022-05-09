const items = document.querySelectorAll('.conteudo li');
const card1 = document.getElementById('card1');
const card2 = document.getElementById('card2');
const card3 = document.getElementById('card3');
const card4 = document.getElementById('card4');
const diferente = document.querySelector('.diferente')
const animado = document.querySelector('.animado');
const body = document.body

body.addEventListener('click', function(){
    body.style.backgroundColor = "grey";
})

items.forEach(function(option){
    option.addEventListener('click', function() {
        const change = document.getElementById(this.id);
        change.style.backgroundColor = "yellow";
    })
})

card1.addEventListener('click', function() {
    card1.style.backgroundColor = "lightblue";
})

animado.addEventListener('click', function() {
    animado.style.backgroundColor = "yellow";
})


diferente.addEventListener('click', function() {
    diferente.style.backgroundColor = "red";
})

card2.addEventListener('click', function() {
    card2.style.backgroundColor = "orange";
})

card3.addEventListener('click', function() {
    card3.style.backgroundColor = "orange";
})

card4.addEventListener('click', function() {
    card4.style.backgroundColor = "orange";
})