const redesSociais = ['Youtube', 'Twitter', 'Facebook'];

// redesSociais.forEach(function() { 
                                  
//     console.log("Olá");

// });


// redesSociais.forEach(function(socialNetwork){ //Essa função de callback pode receber 3 valores
//                                               // O primeiro parâmetro é o item atual que está sendo iterado          
//     console.log(socialNetwork);

// });


redesSociais.forEach(function(item, index, array, algumacoisa){ // O segundo parâmetro opcional é o index do item atual
                                                            // O terceiro parâmetro opcional é o array que está sendo iterado
        console.log(item, index, array, algumacoisa);
        
 
});



// Callback estruturado 


// const logArrayInfo = function(socialNetwork, index, array){ 
 
// console.log(socialNetwork, index, array);

// };

// socialNetworks.forEach(logArrayInfo);