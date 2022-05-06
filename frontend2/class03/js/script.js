// const playButton = document.getElementById('play');
// const resetButton = document.getElementById('reset');

var pcPoints = 0;
var userPoints = 0;


function play() { 

    let userHand = Number(prompt('Rock(1), paper(2), scissors(3)')); 
    let random = parseInt(Math.random() * 3 + 1); 
    let computerHand = random;

    if (userHand === computerHand) {
        alert('Draw');
    }
    else if (userHand == 1 && computerHand == 2) {
        alert('You lost! Rock with paper!');
        pcPoints++;

    }
    else if (userHand == 3 && computerHand == 1) {
        alert('You lost! Scissors with Rock.');
        pcPoints++;
    }
    else if (userHand == 2 && computerHand == 3) {
        alert('You Lost! Paper with Scissors.');
        pcPoints++;
    }
    else if (userHand == 3 && computerHand == 2) {
        alert('You won! Scissors with paper.');
        userPoints++;

    }
    else if(userHand == 1 && computerHand == 3) {
        alert('You won! Rock with Scissors.');
        userPoints++

    }
    else if(userHand == 2 && computerHand == 1) {
        alert('You won! Paper with Rock.');
        userPoints++;

    }
    else {
        alert('Invalid number!');
    }

    
    
    
}

document.write()

function reset() { 
    alert('Hello!')
}

