
import React from 'react';

const numero = 10;

class TabelaAlunos extends React.Component {
  state = {
    lista : [
      {ra: "0001", nome: "mané Silva", nascimento: "05/08/2000"},
      {ra: "0001", nome: "José Silva", nascimento: "05/08/2010"},
      {ra: "0001", nome: "zé Silva", nascimento: "05/08/2011"},
    ]

  }

  
  render() {

    const listaDisplay = [];
      for (let i =0; i < this.state.lista.length; i++) {
        listaDisplay.push(
          <p>{this.state.lista[i].ra} - {this.state.lista[i].nome}</p>
        )

      }
    

    return (
      <div>
        <h2>TabeLa de Alunos </h2>
        {listaDisplay}
        <button onClick={
          () =>{
          const novoState = {...this.state};
          novoState.lista[0].nome="Aluno Novo";
          this.setState(novoState);
          console.log(this.state.lista)
        }}>Alterar</button>
      </div>
      
    )
  }

}

function LabelInput(props) {
  return (
    <div style={{backgroundColor: props.corFundo}}>
      <label> {props.label} </label>
      <input type="text" />
    </div>
   
  )
}

function App() {
  return (
    <React.Fragment>
      <h1>Hello World{numero}</h1>
      <LabelInput label="RA" corFundo="grey">

      </LabelInput>
      <LabelInput label="nome" corFundo="pink">

      </LabelInput>
      <button>Carregar</button>
      <TabelaAlunos></TabelaAlunos>
    </React.Fragment>
    
    
  );
}

export default App;
