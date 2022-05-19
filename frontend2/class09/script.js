const imagens = document.querySelectorAll(".cartao img");
const urlImagens = [];

imagens.forEach(function (_, contador){
    const url = prompt(`Adicione o url para a imagem ${contador + 1}`);
    urlImagens.push(url);
});

urlImagens.forEach(function(url, index) {
    const imagem = document.querySelector(`#imagem-${index +1}`);
    imagem.setAttribute("src", url)
});

const image1 = document.getElementById('imagem-1').outerHTML;
const image2 = document.getElementById('imagem-2').outerHTML;
const image3 = document.getElementById('imagem-3').outerHTML;

const new_html_image1 = `<a href="${urlImagens[0]}" target="_blank">${image1}</a>`;
document.getElementById("imagem-1").outerHTML = new_html_image1;

const new_html_image2 = `<a href="${urlImagens[1]}" target="_blank">${image2}</a>`;
document.getElementById("imagem-2").outerHTML = new_html_image2;

const new_html_image3 = `<a href="${urlImagens[2]}" target="_blank">${image3}</a>`;
document.getElementById("imagem-3").outerHTML = new_html_image3;
