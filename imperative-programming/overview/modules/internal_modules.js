const readlineSync = require('readline-sync');
const calculator = require('external_modules.js')
const name = readlineSync.question("What's your name?");
const age = readlineSync.question("How old are you?");
const height = readlineSync.question("How tall are you?");

name
age
height

calculator.sum(1,2)

function User(name, id){
    this.name = name;
    this.id = id;
}

var users = [];
for(let i=0;i<10;i++){
    const name = readlineSync.question("What's your name?")
    const id = readlineSync.question("What's yor id?")
    users.push(new User(name,id));
}

