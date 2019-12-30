import React, { Component } from 'react'
import MapDataService from '../service/MapDataService'

class LocationsComponent extends Component{
    render () {
        return (
            <div>
                <h3>type the locations here: </h3>
                origin: <input type="text" name="origin" id="origin"/><br/>
                destination: <input type="text" name="destination" id="destination"/><br/>
                <input onClick={() => MapDataService.getLocationsToMeet(document.getElementById('origin').value, document.getElementById('destination').value)} type="submit" value="Submit"/>
            </div>
        )
    }
}

export default LocationsComponent