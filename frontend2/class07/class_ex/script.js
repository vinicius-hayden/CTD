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

