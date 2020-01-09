import React, { Component } from 'react';
import { Map, Marker, GoogleApiWrapper } from 'google-maps-react'; 

const style = {
    width: '60%',
    height: '60%'
}

class ResultMapComponent extends Component {

    render() {
        let bounds = new this.props.google.maps.LatLngBounds()
        for (let i = 0; i < this.props.results.length; i++) {
            bounds.extend(this.props.results[i].geometry.location)
        }

        return (
            <div >
                <Map
                    style={style}
                    google={this.props.google}
                    zoom={8}
                    initialCenter={{lat:59.95, lng:30.33}}
                    bounds={bounds}
                >
                    {this.props.results.map((result, index) => (
                        <Marker key={index} name={result.name} position={result.geometry.location} />
                    ))}
                </Map>
            </div>
        )
    }         
}

export default GoogleApiWrapper({
    apiKey: 'AIzaSyB40n5w-H4wEJH3E3OM4pBF435b1cPg4AE' 
})(ResultMapComponent);