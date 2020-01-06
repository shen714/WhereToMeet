import React, { Component } from 'react'
import { Map, Marker, GoogleApiWrapper } from 'google-maps-react'; 

const style = {
    width: '100%',
    height: '100%'
}

class ResultMapComponent extends Component {
    render() {
        return (
            <div >
                <Map
                    style={style}
                    google={this.props.google}
                    zoom={8}
                    center={{lat:59.95, lng:30.33}}
                >
                    <Marker />
                </Map>
            </div>
        )
    }         
}

export default GoogleApiWrapper({
    apiKey: 'AIzaSyB40n5w-H4wEJH3E3OM4pBF435b1cPg4AE' 
})(ResultMapComponent);