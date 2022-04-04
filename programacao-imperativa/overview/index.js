//A dataset containing the height and sex (M or F) of 15 people. 
// Write a program that calculates and writes:
//the highest and lowest height of the group;
//the average height of women;
//the number of men.

var readlineSync = require('readline-sync')

function Person(name, height, gender){
    this.name = name;
    this.height = height;
    this.gender = gender;
}

var people = [];
for(let i=0;i<15;i++){
    const name = readlineSync.question("What's your name?")
    const height = readlineSync.question("What's yor height?")
    const gender = readlineSync.question("What's your gender?")
    people.push(new Person(name,height,gender));
}

function greaterNumber(array){
    for(let i=0; i < array;i++){
        var greatnum = 0
        if([i] > greatnum){
            greatnum = [i];
        }
    }
    return greatnum
}

greaterNumber(people);

function minorNumber(array){
    var minnum = 0
    for(let i=0; i < array;i++){
        if([i] < minnum){
            minnum = [i];
        }
    }
    return minnum
}

minorNumber(people);

function avgWomenHeight(array){
    var sumHeight = 0;
    var sumWomen = 0;
    for(let i=0;i<array;i++){
        sumHeight = sumHeight + [i];
        sumWomen ++;
    }
    var heightAvg = (sumHeight/sumWomen);
    return heightAvg
}

avgWomenHeight(people);
