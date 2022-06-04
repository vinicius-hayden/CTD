const { subtracao } = require("../calc");

describe('Teste de subtração', () =>{

    test('Subtração de dois números', () =>{
        expect(subtracao(5,3)).toBe(2);
    })

})

