let prom = new Promise((resolve, reject) => {
  let result = 2 + 2;

  if (result == 4) {
    resolve("Soma de dois + dois é 4");
  }
  else { 
    reject("Deu ruim");
  }
});

prom.then((mensagem) => { 
    console.log('Deu boa e está dentro do then' + mensagem);
}).catch((err) => {
    console.log('Deu ruim, e está dentro do catch' + err)
})