import React from 'react';
import Aluno from './components/Aluno';
import Login from './components/Login';

import { BrowserRouter, Route, Switch } from 'react-router-dom';
function App() {
  return (
    <React.Fragment>
     {/*  <p>Token: {this.context.token}</p> */}
      <BrowserRouter>
        <Switch>
          <Route path="/login" component={Login} />
          <Route path="/aluno" component={Aluno} />
        </Switch>

      </BrowserRouter>
    </React.Fragment>

  );
}

export default App;
