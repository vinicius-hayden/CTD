const botaoVerMais = document.createElement("button");
const botaoTexto = document.createTextNode("Ver mais");
const botaoTexto2 = document.createTextNode(" Continuação");
botaoVerMais.appendChild(botaoTexto);
botaoVerMais.appendChild(botaoTexto2);
document.body.appendChild(botaoVerMais);
const titulo = document.getElementById('titulo');
const input1 = document.getElementById('input1');
input1.setAttribute('disabled', ''); 
