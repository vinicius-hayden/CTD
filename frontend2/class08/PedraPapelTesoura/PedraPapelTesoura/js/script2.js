
var pontuacaoPc = 0
var pontuacaoUs = 0

//atribuição das variaveis globais que vão circular por todo o script


function jogar() {

    //1º Passo: atribuição de constantes globais da função, o primeiro query selector tem a função de selecionar
    const options = document.querySelectorAll('.selections button'); //o query selector dos botões deve ser um querySelectorAll
    const computerOptions = ['👊', '🖐', '✌'];

    var displayUs = document.querySelector('.results-score-us')// seletor do elemento HTML que recebera a pontuação do usuário e do pc
    var displayPc = document.querySelector('.results-score-pc')


    options.forEach(function (option) { //criação de um forEach que procará uma função no click, ou seja, adcionar um event listener para cada botão que está em options
        option.addEventListener('click', function () {

            const computerNumber = Math.floor(Math.random() * 3)
            const computerChoice = computerOptions[computerNumber]

           
            const userChoice = this.textContent // O valor que o usuário escolheu
            compareHands(userChoice, computerChoice) // Aqui é retomado o comparador la de baixo
            // Aqui se da a chamada do compareHands, que é a lógica principal do script
            // Toda vez que clicarmos em alguma das opções o compareHands será chamado, fazendo a verificação do script
            const choices = document.querySelector('.choices')
            choices.innerHTML += `<div>${userChoice}</div> <div>${computerChoice} </div>`

        })

    })

    function compareHands(userChoice, computerChoice) { // A função compare hands precisa receber os parametros da mão do usuário e da mão do pc, para compará-los

       
        const winner = document.querySelector('.winner')

        switch (userChoice) {
            case computerChoice:
                winner.textContent = 'Empatou!'
                break

            case '👊':
                if (computerChoice === '✌') {
                    winner.textContent = 'O usuário ganhou!!!'
                    pontuacaoUs++
                    displayUs.textContent = pontuacaoUs

                }

                else {
                    winner.textContent = 'O pc ganhou!!!'
                    pontuacaoPc++
                    displayPc.textContent = pontuacaoPc
                }
                break


            case '🖐':
                if (computerChoice === '👊') {
                    winner.textContent = 'O usuário ganhou!!!'
                    pontuacaoUs++
                    displayUs.textContent = pontuacaoUs
                }
                else {
                    winner.textContent = 'o pc ganhou!!!'
                    pontuacaoPc++
                    displayPc.textContent = pontuacaoPc
                }
                break

            case '✌':
                if (computerChoice === '🖐') {
                    winner.textContent = 'O usuário ganhou!!!'
                    pontuacaoUs++
                    displayUs.textContent = pontuacaoUs
                }
                else {
                    winner.textContent = 'O pc ganhou!!!'
                    pontuacaoPc++
                    displayPc.textContent = pontuacaoPc
                }
                break


        }



    } //finalização da function jogar()






}

jogar();


