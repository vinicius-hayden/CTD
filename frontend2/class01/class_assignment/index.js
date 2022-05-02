// Create an script that sums the elements of an array consecutively

const array = [1, 2, 4, 8];

for(let i = 0; i < array.length; i++){
    let previous = array[i] - 1;
    let sum = previous + array[i];
    console.log(sum);
}