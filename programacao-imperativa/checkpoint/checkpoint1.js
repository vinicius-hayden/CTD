const tempo_pipoca = 10;
const tempo_macarrao = 8;
const tempo_carne = 15;
const tempo_feijao = 12;
const tempo_brigadeiro = 8;

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
        console.log("Comida no ponto!");
    }
}

function microondas (comida_escolhida, tempo_digitado){
   if (comida_escolhida == 'Pipoca' || comida_escolhida == 1) {
       condicionais_microondas(tempo_pipoca, tempo_digitado);
    }   
    else if (comida_escolhida == 'Macarrão' || comida_escolhida == 2){
        condicionais_microondas(tempo_macarrao, tempo_digitado);
    }
    else if (comida_escolhida == 'Carne' || comida_escolhida == 3)){
        condicionais_microondas(tempo_carne, tempo_digitado);
    }
    else if (comida_escolhida == 'Feijão' || comida_escolhida == 4){
        condicionais_microondas(tempo_feijao, tempo_digitado);
    }
    else if (comida_escolhida == 'Brigadeiro' || comida_escolhida == 5){
        condicionais_microondas(tempo_brigadeiro, tempo_digitado);
    }
    else{
        console.log("Comida inválida.");
    }
    console.log("Prato pronto, bom apetite!!!");
}
