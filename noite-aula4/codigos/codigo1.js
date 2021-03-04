console.log("Hello world JS com Node");

let a = 10;

const aluno1 = {
    ra: "0001",
    nome: "Nicolas Estanislau",
    idade: "18/09/1995",
    sexo: ""
};
console.log(aluno1.nome);
aluno1.nome = "Maria"

console.log(aluno1.nome);

let aluno2 = aluno1;

let lista = [2, 4, 6, 8, 10, 12];

lista[3] = 18;

let listaAlunos = [
    {ra: "0001", nome:"Silva Silva"},
    {ra: "0002", nome:"Mariinnha"},
    {ra: "0003", nome:"Danilo"},
]

console.log(lista[3]);
console.log(listaAlunos[1]);


listaAlunos[1].ra = "2222";
console.log(listaAlunos[1]);

let c = null;

console.log(c);