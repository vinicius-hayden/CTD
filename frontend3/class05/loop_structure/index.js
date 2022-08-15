let fruits = ["Avocado", "Açai", "Papaya", "Grapes"];

let bag = fruits.map((fruit) => fruit.toUpperCase());

console.log("Original Array", fruits);

console.log("Array Copy", bag);

//

let numbers = [1,2,3,4,5,6,7,8,9,10];

let findResult = numbers.find((number) => number > 5);

let filterResult = numbers.filter((number) => number > 5);

console.log(findResult);
console.log(filterResult);

// 

let sum = numbers.reduce((result, currentValue) => result += currentValue);
console.log(sum);