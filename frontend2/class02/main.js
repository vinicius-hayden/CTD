let n1 = Number(window.prompt('Type your first number'));
let n2 = Number(window.prompt('Type your second number'));
let result = n1 + n2;console.log(`The sum between ${n1} and ${n2} equals ${result}`);

// for in 

var person = {
    name: 'John',
    age: 25,
    height: 175,
    weight: 65
}

for (let dado in person){
    console.log(pessoa[dado])
}

// for of

var artists = ['Juana Molina', 'Luis Alberto Spinetta', 'Gustavo Ceratti'];

for (var artist of artists) {
    console.log(artist);
}