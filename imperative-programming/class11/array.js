// Array Invertido

var arrayInverter = [3,2,1];

function imprimirInverso (array){
    for (let i = array.length-1; i >= 0; i--){
        console.log(array[i]);
    }
}

imprimirInverso(arrayInverter)

function inverter (array){
    var newArray = [];
    for(let i = array.length-1; i >= 0; i--){
        newArray.push(array[i]);
    }
    return newArray;
}

console.log(inverter(arrayInverter));

console.log("-----------------");
// Somar Array

let array = [1,2,3];

function somarArray(array){
    var soma = 0;
    for (let i=0; i<= array.length; i++){
        soma = i + soma;
    }
    console.log(soma);
}

somarArray(array);
console.log("-----------------");
// Join Array

let arrayWord = ["O","L","Á"]

function join(array){
    const newArray = String(array);
    const newArrayWithoutComma = newArray.replace(/,/g,'');
    console.log(newArrayWithoutComma);
}

join(arrayWord);
console.log("-----------------");
//Coleções de Filmes (e mais...)

var movies = ["Star wars", "Matrix", "Mr. robot", "O preço do amanhã", "A vida é bela"];

function capitalLetter(array){
    var caps = [];
    for(let i=0; i < array.length; i++){
        caps.push(array[i].toUpperCase());
    }
    return caps;
}

console.log(capitalLetter(movies));

var movies_2 = ["Toy story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"];
var titulosRemovidos = [];
titulosRemovidos = movies_2.pop();
console.log(titulosRemovidos);

function gatherArrays(array1, array2){
   for(let i=0; i < array2.length; i++){
        array1.push(array2[i]);
   }
   return array1;
}

console.log(gatherArrays(movies,movies_2));

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function compareScores(score1, score2){
    for(let i=0;i <score1.length;i++){
        if (score1[i] == score2[i]){
            console.log("Notas iguais")
        }
        else {
            console.log("Notas diferentes")
        }
    }
}

compareScores(asiaScores,euroScores)