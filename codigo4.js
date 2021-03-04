function cabecalho(autor) {
    console.log("Aplicação teste do node");
    console.log("feito por:" + autor);
    console.log();
}

function somar(n1, n2) {
    return n1 + n2;
}

function calcular(n1, n2, operacao) {
    return operacao(n1, n2);
}

//let resultado = calcular(50, 40, somar);

/* let resultado = calcular(50, 40, (n1, n2) =>{
    return n1 ** n2;
}) */

let resultado = calcular(50, 40, (n1, n2) => n1 * n2)

console.log("50 elevado 40 = " + resultado)
const funcao1 = () => {
    console.log("Arrow function")
}


funcao1();
cabecalho("Nicolas");
cabecalho("João");