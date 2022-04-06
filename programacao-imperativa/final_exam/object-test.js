// Crie uma função construtora que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números). 
function Aluno(nome, qtd_faltas, notas){
    this.nome = nome;
    this.qtd_faltas = qtd_faltas;
    this.notas = notas;
    //Na função construtora crie o método calcularMedia que retorna a média de suas notas. 
    this.calcularMedia = function() {
        sumNotas = 0;
        for(let i=0;i<this.notas.length;i++){
            sumNotas = sumNotas + this.notas[i]
        }
        var media = sumNotas/this.notas.length;
        return media;        
    }
// Também terá um método chamado faltas, que simplesmente aumenta o número de faltas em 1. 
    this.faltas = function(){
        this.qtd_faltas = this.qtd_faltas + 1;
        return this.qtd_faltas;
    }
}

//Crie alguns alunos para testar a sua função construtora.
const aluno1 = new Aluno("Roberto Ferreira", 1, [2,4,5,6]);
console.log(aluno1.calcularMedia()); // Utilização da função de cálculo de média do aluno passado como parâmetro.
console.log(aluno1.faltas()); // Testando a função de adicionar faltas

const aluno2 = new Aluno("Ana Lesnovski", 3, [8,7,5,10]);
console.log(aluno2.calcularMedia());

const aluno3 = new Aluno("Jun Hasegawa", 2, [8,8.5,9.75,10]);
console.log(aluno3.calcularMedia());

//Crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) 
// e uma lista de estudantes (um array composto pelos alunos criados no passo 2).
curso = {
    nome_do_curso: "Certified Tech Developer",
    nota_aprovacao: 7,
    faltas_max: 2,
    lista_estudantes: [aluno1, aluno2, aluno3],
    //Crie o método que permite adicionar alunos à lista do curso, ou seja, 
    //quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.
    adicionarAluno: function(aluno){
        this.lista_estudantes.push(aluno);
    },
    // Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação. 
    //Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. 
    //Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.
    aprovado: function(aluno){
        const porcentagem = (this.nota_aprovacao + (this.nota_aprovacao/10));
        const media_aluno = aluno.calcularMedia();

        console.log(`aluno ${aluno.nome}`);
        console.log(`faltas ${aluno.qtd_faltas}`);
        console.log(`media aluno ${media_aluno}`);
        console.log(`porcentagem ${porcentagem}`);
        console.log(`--------------`);

        
        if(media_aluno < this.nota_aprovacao || aluno.qtd_faltas > this.faltas_max){
            return false;
        }
        else if(aluno.qtd_faltas == this.faltas_max) {
            if(media_aluno >= porcentagem) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
        
    },
    //Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não. 
    aprovadosEReprovados: function(){
        var resultado = [];
        console.log(this.lista_estudantes.length);
        for(let i=0;i < this.lista_estudantes.length;i++){
            if(this.aprovado(this.lista_estudantes[i]) == true){
                resultado.push(true);
            }
            else{
                resultado.push(false);
            }

        }
        return resultado;
    }
       
}

const aluno4 = new Aluno("Tom Scharpling", 0, [10,10,5,10]); // Teste da função adicionar aluno do passo 4.
curso.adicionarAluno(aluno4); // Teste da função adicionar aluno do passo 4.
console.log(curso.lista_estudantes); //Teste do array criado para visualizar os alunos inseridos no array.
console.log(curso.aprovado(aluno1)); //Teste da função do passo 5 perguntando se o aluno passado como parâmetro passou ou não.
console.log(curso.aprovadosEReprovados()) // Teste do array de booleans do passo 6.
