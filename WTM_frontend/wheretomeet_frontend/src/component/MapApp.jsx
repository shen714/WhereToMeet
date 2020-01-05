import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import LocationsComponent from './LocationsComponent'
import MainPageComponent from './MainPageComponent'

class MapApp extends Component {
    render() {
        return (
            <Router>
                <div>
                    <Switch>
                    <Route path="/" exact component={MainPageComponent} />
                    <Route path="/locations" exact component={LocationsComponent} />                
                    </Switch>
                
                </div>
            </Router>
        )
    }
}

export default MapApp