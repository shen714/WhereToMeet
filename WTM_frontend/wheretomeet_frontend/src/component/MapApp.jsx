import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import LocationsComponent from './Location/LocationsComponent'
import MainPageComponent from './MainPageComponent'
import NotFoundComponent from './NotFoundComponent'
import AboutUsComponent from './AboutUs/AboutUsComponent';
import SignUpComponent from './SignUpComponent';

class MapApp extends Component {
    render() {
        return (
            <Router>
                <div>
                    <Switch>
                    <Route path="/" exact component={MainPageComponent} />
                    <Route path="/aboutus" exact component={AboutUsComponent} />
                    <Route path="/locations" exact component={LocationsComponent} /> 
                    <Route path="/signup" exact component={SignUpComponent} /> 
                    <Route component={NotFoundComponent} />               
                    </Switch>
                </div>
            </Router>
        )
    }
}

export default MapApp