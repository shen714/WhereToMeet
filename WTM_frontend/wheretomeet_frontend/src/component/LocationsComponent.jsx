import React, { Component } from 'react'
import MapDataService from '../service/MapDataService'

class LocationsComponent extends Component{
    constructor(props) {
        super(props)
        this.state = {
            results: []
        }
        this.getMeetingLocations = this.getMeetingLocations.bind(this)
    }

    getMeetingLocations(origin, destination) {
        MapDataService.getLocationsToMeet(origin, destination)
            .then(
                response => {
                    this.setState({results: response.data.results})
                }
            )
    }

    render () {
        return (
            <div>
                <h3>type the locations here: </h3>
                origin: <input type="text" name="origin" id="origin"/><br/>
                destination: <input type="text" name="destination" id="destination"/><br/>
                <input onClick={() => this.getMeetingLocations(document.getElementById('origin').value, document.getElementById('destination').value)} type="submit" value="Submit"/>
                <ul>
                    {this.state.results.map((result, index) => (
                        <li key={index}>
                            <div>{result.name}</div>
                            <div>{result.plus_code.compound_code}</div>
                        </li>
                    ))}
                </ul>
                
            </div>
        )
    }
}

export default LocationsComponent