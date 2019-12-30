import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import PreferencesComponent from './PreferencesComponent'
import LoginComponent from './LoginComponent'
import MainPageComponent from './MainPageComponent'

class UserPreferenceApp extends Component {
    render() {
        return (
            <Router>
                <div>
                    <Switch>
                    <Route path="/" exact component={MainPageComponent} />
                        <Route path="/userpreferences" exact component={PreferencesComponent} />
                        <Route path="/login" exact component={LoginComponent} />
                        
                    </Switch>
                
                </div>
            </Router>
        )
    }
}

export default UserPreferenceApp