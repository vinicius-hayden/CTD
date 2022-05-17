const body = document.getElementById("body");

window.onload = function() {
    mainPage();
}

function mainPage() {
    div = document.createElement('div');
    let html = `
    <h1>This is a test!</h1>
    <p> Hello, this code is being generated directly from a JavaScript code!</p>
    <img src="https://external-preview.redd.it/1guJhDjwXo8QeM9hi3T-8ryju8kaKzKO_n4QHmXsr7M.jpg?auto=webp&s=aa919b2bfb3cb5bc02f578cffc32932a7d0030b3"> 
    `;

    const content = document.write(html);
    div.appendChild(content);
}



// var name = prompt('Insira seu nome');
// var text = document.createTextNode('Hello, '+ name);
// var p = document.createElement('p');
// document.body.appendChild(text);