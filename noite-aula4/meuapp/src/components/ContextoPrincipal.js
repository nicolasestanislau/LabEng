import React from 'react';

const Contexto = React.createContext({})

export class EstadoPrincipal extends React.Component {
    state = {
        token: "",
    }

    setToken = (novoToken) => {
        const novoState = {...this.state};
        novoState.token = novoToken;
        this.setState(novoState);
    }
    render() {
        return (
            <Contexto.Provider value={{
                token: this.state.token,
                setToken: this.setToken
            }} >
                {this.props.children}
            </Contexto.Provider>
        )
    }
}
export default Contexto;