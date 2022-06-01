const inputKey = document.getElementById('inpKey');
const inputValue = document.getElementById('inpValue');
const insertBtn = document.getElementById('btnInsert');
const isOutput = document.getElementById('isOutput');
const clearBtn = document.getElementById('clearBtn');

insertBtn.addEventListener('click', () => {
    let key = inputKey.value;
    let value = inputValue.value;

    if (key && value) {
        localStorage.setItem(key, value);
        location.reload();
    }
})

// clearBtn.addEventListener('click', () => {
//     localStorage.clear;
// })

for (let i = 0; i < localStorage.length; i++) {
    const key = localStorage.key(i);
    const value = localStorage.getItem(key);
    isOutput.innerHTML += `${key}: ${value} <br>`;
}

const localStorageData = localStorage;
console.log(localStorageData.getItem('Nome'));
colors = localStorageData.getItem('Colors');

const colorsToJson = JSON.parse(colors);
console.log(colorsToJson);



