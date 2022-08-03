
function Aluno(nome, qtd_faltas, notas){
    this.nome = nome;
    this.qtd_faltas = qtd_faltas;
    this.notas = notas;
    this.calcularMedia = function() {
        sumNotas = 0;
        for(i=0;i<this.notas.length;i++){
            sumNotas = sumNotas + this.notas[i]
        }
        var media = sumNotas/this.notas.length;
        return media;        
    }

    this.faltas = function(){
        this.qtd_faltas = this.qtd_faltas + 1;
        return this.qtd_faltas;
    }
}

// 
const aluno1 = new Aluno("Roberto Ferreira", 2, [2,4,5,6]);
console.log(aluno1.calcularMedia());
console.log(aluno1.faltas());

const aluno2 = new Aluno("Ana Lesnovski", 0, [8,7,5,10]);
console.log(aluno2.calcularMedia());
console.log(aluno2.faltas());

const aluno3 = new Aluno("Jun Hasegawa", 1, [8,8.5,9.75,10]);
console.log(aluno3.calcularMedia());
console.log(aluno3.faltas());

var alunos = [];

curso = {
    nome_do_curso: "Certified Tech Developer",
    nota_aprovacao: 7,
    faltas_max: 2,
    lista_estudantes: [aluno1, aluno2, aluno3],
    adicionarAluno: function(aluno){
        this.lista_estudantes.push(aluno);
    },
    aprovado: function(aluno){
        const porcentagem = (this.nota_aprovacao + (this.nota_aprovacao/10));
        const media_aluno = aluno.calcularMedia();
    
        if(media_aluno < this.nota_aprovacao){
            return false;
        }
        else if(aluno.qtd_faltas > this.faltas_max  && media_aluno >= porcentagem){
            return true;
        }
        else if(aluno.qtd_faltas < this.faltas_max && media_aluno >= this.nota_aprovacao){
            return true;
        }
        
    },
    aprovadosEReprovados: function(){
        var resultado = [];
        for(i=0;i < this.lista_estudantes.length;i++){
            if(this.aprovado(this.lista_estudantes[i]) == true){
                resultado.push(true)
            }
            else{
                resultado.push(false)
            }
        }
        return resultado;
    }
       
}

console.log(curso.lista_estudantes)

const aluno4 = new Aluno("Tom Scharpling", 0, [10,10,5,10]);
curso.adicionarAluno(aluno4);
console.log(curso.lista_estudantes);
console.log(curso.aprovado(aluno1));

