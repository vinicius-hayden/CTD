const body = document.getElementById('body');

let formulario = `
    <input type="text"> 
    <input type="submit" value="Submit" id="submit"> 
    <input type="reset" value="Reset">
`
document.write(formulario);

const submit = document.getElementById("submit");

submit.onclick = function(){
    event.preventDefault();
}

window.onload = (function(){
    alert("Alerta!");
})

let text = `<h1 id="text">Passe o cursor aqui</h1>`
document.write(text);

text = document.getElementById("text");

text.onmouseover = function(){
    text.style.color = "blue";
}

document.write(
    `<h2>Digite aqui algo!</h2>
    <input type="text" class="keyboard"> 
`);

const inputs = [];

const keyboard = document.querySelector('.keyboard');

keyboard.addEventListener('keypress', e =>{
    let div = document.createElement('div');
    inputs.push(e.key);

    inputs.forEach(function(value){
        let typedInputs = (`
        <p>${value}</p>
        `)
        
        div.innerHTML = typedInputs;
        body.appendChild(div);

    })
})

