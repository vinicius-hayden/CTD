const object = [
    {
        "nome": "John",
        "idade": 20,
        "localization": "Minessota",
        "profission": {
            "Programmer": "Hello!"
        },
        "hobbies": [
            "Play",
            "Program",
            "Listen To Music"
        ]
    }
    ,
    {
        "nome": "Richard",
        "idade": 25,
        "localization": "Minessota",
        "profission": {
            "Programmer": "Hello!",
            "CTO": "Apple"
        },
        "hobbies": [
            "Play",
            "Program",
            "Listen To Music"
        ]
    }
];

// const jsonConverter = JSON.stringify(object);
// document.write(jsonConverter);
// console.log(jsonConverter);
// const objectConverter = JSON.parse(object);
// console.log(object)

const objToJson = JSON.stringify(object); // Send an object to API or database, local storage or session storage
console.log(objToJson);

const jsonToObj = JSON.parse(objToJson);
console.log(jsonToObj);






