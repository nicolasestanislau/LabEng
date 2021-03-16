
import React from 'react';


class TabelaCachorro extends React.Component {
  

  
  render() {
    const lista = this.props.state.lista;
    const listaDisplay = [];
      for (let i =0; i < lista.length; i++) {
        listaDisplay.push(
          <p> {lista[i].id} - {lista[i].especie} - {lista[i].raca} - {lista[i].nome} </p>
        )

      }
    

    return (
      <div>
        <h2>Tabela de Cachorros </h2>
        {listaDisplay}
      </div>
      
    )
  }

}

function LabelInput(props) {
  return (
    <div>
      <label> {props.label} </label>
      <input type="text" value={props.value}
            onChange={(e) => {
              if(props.atualizarTexto){
                  props.atualizarTexto(e.target.value);

                 }
                }}/>

    </div>
   
  )
}

class App extends React.Component {
  state = {
    cachorroAtual: {
      id: "",
      nome: "",
      especie: "",
      raca: ""

    },

    lista : [
      {id: "0001", nome: "mané Silva", especie: "Canis familiaris", raca: "Buldogue"},
    ]
  }

  atualizarTexto(campo, txt) {
    console.log(txt);
    const novoState = {...this.state}
    novoState.cachorroAtual[campo] = txt;
    this.setState(novoState);
  }

  salvar() {

    console.log(this.state.cachorroAtual)
    const newState = {...this.state}
    newState.lista.push({...this.state.cachorroAtual})
    this.setState(newState)

  
  }

  render() {
  return (
    <React.Fragment>
      <h1>Registro</h1>
      <LabelInput label="id" value={this.state.cachorroAtual.id} atualizarTexto={(txt) => this.atualizarTexto('id', txt)}>

      </LabelInput>
      <LabelInput label="nome" value={this.state.cachorroAtual.nome} atualizarTexto={(txt) => this.atualizarTexto('nome', txt)}>

      </LabelInput>
      <LabelInput label="especie" value={this.state.cachorroAtual.especie} atualizarTexto={(txt) => this.atualizarTexto('especie', txt)}>

      </LabelInput>
      <LabelInput label="raca" value={this.state.cachorroAtual.raca} atualizarTexto={(txt) => this.atualizarTexto('raca', txt)}>

      </LabelInput>
      <button onClick={
        () => {this.salvar()}
      }>Gravar</button>
      <TabelaCachorro state={this.state}></TabelaCachorro>
    </React.Fragment>

  );

  }
    
    
}

export default App;
