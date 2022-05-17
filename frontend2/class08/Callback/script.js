// const myFunc = function(callback) {
//     const value = 77;

//     callback(value); //Por que estamos invocando o parâmetro callback? Porque o valor que ele
//                      // vai receber é a declaração de uma função
//                      // Pois quando chamamos a função myFunc precisamos inserir como seu argumento
//                      // a declaração de outra função

// }

// myFunc(function(valordoCallBack){
//     console.log(valordoCallBack)

// })










function boasvindas(nome) {
    alert('Olá ' + nome);
    //Não precisa casar os nomes nas duas funções

  }


  
function promptUsuario(callback) {
    let name = prompt('Por favor insira seu nome.');
    callback(name);
    
  }
  
  promptUsuario(boasvindas);