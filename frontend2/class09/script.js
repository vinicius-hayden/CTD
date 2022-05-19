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
// const image2 = document.getElementById('imagem-2').innerHTML;
// const image3 = document.getElementById('imagem-3').innerHTML;

// image1.style.backgroundColor = 'blue';
// image2.style.backgroundColor = 'red';
// image3.style.backgroundColor = 'orange';

const new_html = `<a href="youtube.com">${image1}</a>`;
document.getElementById("imagem-1").outerHTML = new_html;






// image1.append(document.createElement('a'));
// image2.append(document.createElement('a'));
// image3.append(document.createElement('a'));





