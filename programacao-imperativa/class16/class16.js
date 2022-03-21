// Sala 6 - João Victor, Ibson Pereira, Elaine Onuki, Vinícius Hayden e Vinícius Marques

const a = [23, 82, 46];
const b = [45, 8, 32];

function encontrarGanhador(a,b){
    pontuacao_a = 0
    pontuacao_b = 0
    for(let i = 0; i < a.length; i++){
        if(a[i] > b[i]){
            pontuacao_a = pontuacao_a + 1
        }
        else if(a[i] < b[i]){
            pontuacao_b = pontuacao_b + 1
        }
        else{
        console.log("Empate")    
        }
    }
    if(pontuacao_a > pontuacao_b){
        console.log("A ganhou")
    }
    else if(pontuacao_b > pontuacao_a){
        console.log("B ganhou")
    }
    else{
        console.log("Empate")
    }
}

encontrarGanhador(a,b)

function digitalHouse(num1, num2){
    for(let i=1; i <= 100; i++){
        if(i%num1 == 0 && i%num2 == 0){
            console.log(`${i}, Digital House`)
        }
        else if(i%num1 == 0){
            console.log(`${i}, Digital`);
        }
        else if(i%num2 == 0){
            console.log(`${i}, House`)
        }
        else{
            console.log(i);
        }
    }
}

digitalHouse(2,3);

var num = [25, 25, 25, -25];

function somaArray(array){
    var soma = 0;
    for(let i = 0; i < array.length; i++){
        soma = array[i] + soma;
    }
    console.log(soma)
}
somaArray(num);

const ola = ["o", "l", "a"]
const tchau = ["t", "c", "h", "a", "u"]

function join(array){
    var arrayJoin = ""
    for(let i = 0; i < array.length; i++){
        arrayJoin = arrayJoin + array[i];
    }
    console.log(arrayJoin)
}

join(ola);