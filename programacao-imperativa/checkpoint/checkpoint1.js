const tempo_pipoca = 10 
const tempo_macarrao = 8
const tempo_carne = 15
const tempo_feijao = 12
const tempo_brigadeiro = 8

function condicionais_microondas(tempo_predefinido, tempo_digitado){
    if (tempo_digitado < tempo_predefinido){
        console.log("Tempo insuficiente");
    }
    else if (tempo_digitado >= 3*tempo_predefinido){
        console.log("Kabuuum.");
    }
    else if (tempo_digitado >= 2*tempo_predefinido){
        console.log("A comida queimou.");
    }
    else {
        console.log("Comida no ponto!")
    }
}

function microondas (comida_escolhida, tempo_digitado){
   if (comida_escolhida == 'Pipoca') {
       condicionais_microondas(tempo_pipoca, tempo_digitado);
    }   
    else if (comida_escolhida == 'Macarrão'){
        condicionais_microondas(tempo_macarrao, tempo_digitado);
    }
    else if (comida_escolhida == 'Carne'){
        condicionais_microondas(tempo_carne, tempo_digitado);
    }
    else if (comida_escolhida == 'Feijão'){
        condicionais_microondas(tempo_feijao, tempo_digitado);
    }
    else if (comida_escolhida == 'Brigadeiro'){
        condicionais_microondas(tempo_brigadeiro, tempo_digitado);
    }
    else{
        console.log("Comida inválida.");
    }
}

microondas("Pipoca", tempo_pipoca);
console.log("Prato pronto, bom apetite!!!")


//function microondas()


