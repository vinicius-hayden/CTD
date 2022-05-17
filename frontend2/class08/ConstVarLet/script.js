

   




















if (true) {
    const teste = {nome: "Jota"};
    //errado, pois é uma const: teste = {nome: "Priscila"}
    teste.nome = "Priscila"
    teste.idade = 17
    teste.altura = 1.80
    console.log(teste)
}


if (true) {
    const array = [1, 2, '3', '4']
    // errado: array = ['1', '2', '3', '4', '2']
    array.unshift(2) // unshift para adicionar um valor no começo do array
    array.push(10) //push para adicionar um valor no final do array
    // errado: array= ['2', '2', '3', '4']
    let soma = array[0] + array[5]
    console.log(soma)
    // console.log(array[5])

  
    

}