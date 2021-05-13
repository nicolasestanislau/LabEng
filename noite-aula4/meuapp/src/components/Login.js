import React from 'react';
import axios from 'axios';
import Contexto from './ContextoPrincipal';

const URL_BASE = 'http://localhost:8080/login'

class Login extends React.Component {
    static contextType = Contexto;

    state = {
        username: "",
        password: ""
    }
    setCampo(campo, value) {
        const novoState ={...this.state};
        novoState[campo] = value;
        this.setState(novoState);
    }
    login() {
        const dados = {
            usuario: this.state.username,
            senha: this.state.password
        };
        axios.post(URL_BASE + 'login', dados)
        .then((response) => {
            console.log("Resposta ==>", response);
            const token = response.data.token;
            console.log("Token ==>", token);
            this.context.setToken(token);
            this.props.history.push('/aluno');
        })
        .catch((err) => {
            console.log("Erro ==>", err)
        })
    }
    render() {
        return (
            <div className="container">
                <h1>Login</h1>
                <form>
                    <div className="form-group">
                        <label>Username</label>
                        <input type="text" className="form-control1"
                                value={this.state.username}
                                onChange={(e) => {
                                    this.setCampo('username', e.target.value)
                                }} />
                    </div>
                    <div className="form-group">
                        <label>Password</label>
                        <input type="password" className="form-control1"
                                value={this.state.password}
                                onChange={(e) => {
                                    this.setCampo('password', e.target.value)
                                }} />
                    </div>
                    <div className="form-group">
                        <button type="button" className="btn btn-primary"
                        onClick={() => {
                            this.login();
                            console.log("Username ==>", this.state.username);
                            console.log("Password ==>", this.state.password);
                        }}>
                                Login
                        </button>

                    </div>

                    
                </form>
            </div>
        )
    }
}

export default Login;