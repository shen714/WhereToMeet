import LoginCompnent from "./LoginComponent";
import "./MainPageComponent.css";

import React, { Component } from 'react'

class MainPageComponent extends Component {
    render() {
        return (
            <div className="MainPage">
                <div className="LoginContainer">
                    <LoginCompnent />
                </div>
            </div>
        )
    }
}

export default MainPageComponent