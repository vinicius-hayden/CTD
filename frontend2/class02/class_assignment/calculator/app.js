let option = window.prompt('sum or subtraction? (s/ss)');

if (option.toLowerCase() == 's') {
    let firstNum = Number(window.prompt('Type your first number'));
    let secondNum = Number(window.prompt('Type your second number')); 
    let sum = firstNum + secondNum;
    alert(`${firstNum} + ${secondNum} = ${sum}`);
}
else if (option.toLowerCase() == 'ss') {
    let firstNum = Number(window.prompt('Type your first number'));
    let secondNum = Number(window.prompt('Type your second number')); 
    let sum = firstNum - secondNum;
    alert(sum);
}
else {
    alert('Please, type a valid input.')
}


