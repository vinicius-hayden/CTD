function calc() {

    let option = window.prompt('Sum or Subtraction? (+ or -)');
    
    if (option == '+') {

        let firstNum = Number(window.prompt('Type your first number'));
        
        if(typeof(firstNum) != Number) {
            alert('Please, type a number')
            calc(); 
        }

        let secondNum = Number(window.prompt('Type your second number')); 
        
        if(isValid(secondNum) == false) {
            alert('Please, type a number')
            calc(); 
        }

        let sum = firstNum + secondNum;
        alert(`${firstNum} + ${secondNum} = ${sum}`);
        let choice = window.prompt('Do you want to do it again? (y/n)')
        if(choice.toLowerCase() == 'y') {
            calc();
        }

    }
    else if (option == '-') {

        let firstNum = Number(window.prompt('Type your first number'));
        
        if(typeof(firstNum) != Number) {
            alert('Please, type a number')
            calc(); 
        }

        let secondNum = Number(window.prompt('Type your second number')); 

        if(typeof(secondNum) != Number) {
            alert('Please, type a number')
            calc(); 
        }
        let sum = firstNum - secondNum;
        alert(`${firstNum} - ${secondNum} = ${sum}`);
        let choice = window.prompt('Do you want to do it again? (y/n)')
        if(choice.toLowerCase() == 'y') {
            calc();
        }
    }
    else {
        alert('Please, type a valid input.')
        calc();
    }

}

calc();

