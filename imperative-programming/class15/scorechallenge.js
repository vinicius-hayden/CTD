const participanteB = [5,8,4,9,5];
const participanteA = [8,7,8,6,8];
const participanteC = [7,5,10,8,3];

function pontuacaoMedia(pontuacaoParticipante){
    let somaPontuacoes = 0;
    for(i = 0; i < pontuacaoParticipante.length; i++){
        somaPontuacoes = somaPontuacoes + pontuacaoParticipante[i];
    }
    let mediaPontuacaoParticipante = somaPontuacoes/(pontuacaoParticipante.length)
    return mediaPontuacaoParticipante;
}

function pontuacaoMaior(pontuacaoParticipante){
    let maiorPontuacao = 0;
    for(i = 0; i < pontuacaoParticipante.length; i++){
        if (pontuacaoParticipante[i] > maiorPontuacao){
            maiorPontuacao = pontuacaoParticipante[i];
        }
    }
    return maiorPontuacao;
}

function competição(participante1, participante2, participante3){
    //somaPontuacoes(participante1);
    //pontuacaoMedia(participante1);
    //somaPontuacoes(participante2);
    //pontuacaoMedia(participante2);
    //somaPontuacoes(participante3);
    //pontuacaoMedia(participante3);
     
    if(pontuacaoMedia(participante1) > pontuacaoMedia(participante2) && pontuacaoMedia(participante1) > pontuacaoMedia(participante3)){
        console.log(`Melhor média foi o primeiro participante: ${pontuacaoMedia(participante1)}`);
    }
    else if(pontuacaoMedia(participante2) > pontuacaoMedia(participante1) && pontuacaoMedia(participante2) > pontuacaoMedia(participante3)){
        console.log(`Melhor média foi do segundo participante: ${pontuacaoMedia(participante2)}`);
    }
    else if(pontuacaoMedia(participante3) > pontuacaoMedia(participante1) && pontuacaoMedia(participante3) > pontuacaoMedia(participante2)){
        console.log(`Melhor média foi do terceiro participante: ${pontuacaoMedia(participante3)}`);
    }
    else{
        console.log("EMPATE")
    }

    if(pontuacaoMaior(participante1) > pontuacaoMaior(participante2) && pontuacaoMaior(participante1) > pontuacaoMaior(participante3)){
        console.log(`Melhor nota foi do primeiro participante: ${pontuacaoMaior(participante1)}`);
    }
    else if(pontuacaoMaior(participante2) > pontuacaoMaior(participante1) && pontuacaoMaior(participante2) > pontuacaoMaior(participante3)){
        console.log(`Melhor nota foi do segundo participante: ${pontuacaoMaior(participante2)}`);
    }
    else if(pontuacaoMaior(participante3) > pontuacaoMaior(participante1) && pontuacaoMaior(participante3) > pontuacaoMaior(participante2)){
        console.log(`Melhor nota foi do terceiro participante: ${pontuacaoMaior(participante3)}`);
    }
    else{
        console.log("EMPATE")
    }
}
 
competição(participanteA, participanteB, participanteC)
