function cadastro_banco(titular_da_conta, numero_da_conta, tipo_de_conta, saldo){
    this.titular_da_conta = titular_da_conta;
    this.numero_da_conta = numero_da_conta;
    this.tipo_de_conta = tipo_de_conta;
    this.saldo = saldo;
}

let banco = {
    lista:[],
    listaCadastroBanco: function(){
        for(let i = 0; i<this.lista.length; i++){
            console.log(this.lista[i]);
        }
    },
    consultarCliente: function(titular){
        if(titular == cadastro_banco.titular_da_conta){
            console.log(cadastro_banco.titular_da_conta);
        }
    },
    deposito: function(titular, qtd_dinheiro){
        for(let i = 0; i<this.lista.length; i++){
            if(titular == cadastro_banco.titular_da_conta){
                var novo_saldo = cadastro_banco.saldo + qtd_dinheiro
                console.log(`Depósito realizado, seu novo saldo é ${novo_saldo}`);
            }
            else{
                console.log("Titular não encontrado")
            }
        }
    },
    saque: function(titular, valor_ser_extraido){
        for(let i = 0; i<this.lista.length; i++){
            if(titular == cadastro_banco.titular_da_conta){
                if(cadastro_banco.saldo > 0){
                    var extracao = cadastro_banco.saldo - valor_ser_extraido
                    console.log(`Extração feita com sucesso, seu novo saldo é: ${extracao}`)
                }
                else{
                    console.log("Fundos insuficientes")
                }
            }   
            else{
                console.log("Titular não encontrado")
            }
        }
    }
}

banco.lista.push(new cadastro_banco("Abigael Natte", "5486273622", "Conta Corrente", 27771));
banco.lista.push(new cadastro_banco("Ramon Connell", "1183971869", "Conta Poupança", 8675));
banco.lista.push(new cadastro_banco("Jarret Lafuente", "9582019689", "Conta Poupança", 27363));
banco.lista.push(new cadastro_banco("Ansel Ardley", "1761924656", "Conta Poupança", 32415));
banco.lista.push(new cadastro_banco("Jacki Shurmer", "7401971607", "Conta Poupança", 18789));
banco.lista.push(new cadastro_banco("Jobi Mawtus", "630841470", "Conta Corrente", 28776));
banco.lista.push(new cadastro_banco("Thomasin Latour", "4223508636", "Conta Corrente", 2177));
banco.lista.push(new cadastro_banco("Lonnie Verheijde", "185979521", "Conta Poupança", 25994));
banco.lista.push(new cadastro_banco("Alonso Wannan", "3151956165", "Conta Corrente", 7601));
banco.lista.push( new cadastro_banco("Bendite Huggett", "2138105881", "Conta Poupança", 33196));

console.log(banco.lista)