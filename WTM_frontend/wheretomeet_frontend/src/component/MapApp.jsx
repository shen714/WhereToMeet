import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import LocationsComponent from './Location/LocationsComponent'
import MainPageComponent from './MainPageComponent'
import NotFoundComponent from './NotFoundComponent'
import AboutUsComponent from './AboutUs/AboutUsComponent';
import SignUpComponent from './SignUpComponent';
import LogoutComponent from './LogoutComponent'
import AuthenticatedRoute from './AuthenticatedRoute';
import NavBarComponent from './NavBarComponent';
import PreferencesComponent from './PreferencesComponent';

class MapApp extends Component {
    render() {
        return (
            <Router>
                <NavBarComponent />
                <div>
                    <Switch>
                        <Route exact path="/">
                            <MainPageComponent />
                        </ Route>
                        <Route exact path="/signup">
                            <SignUpComponent />
                        </Route>
                        <Route exact path="/aboutus">
                            <AboutUsComponent />
                        </ Route>
                        <AuthenticatedRoute exact path="/logout">
                            <LogoutComponent />
                        </ AuthenticatedRoute>
                        <AuthenticatedRoute exact path="/locations">
                            <LocationsComponent />
                        </ AuthenticatedRoute>
                        <AuthenticatedRoute exact  path="/preference">
                            <PreferencesComponent />
                        </ AuthenticatedRoute>
                        <Route >
                            <NotFoundComponent />
                        </Route>
                    </Switch>
                </div>
            </Router>
        )
    }
}

export default MapApp