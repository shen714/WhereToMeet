import React, { Component } from 'react'
import MapDataService from '../service/MapDataService'
import ResultsComponent from './ResultLocationsComponent'


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
                    console.log(response);
                    this.setState({results: response.data.results})
                },
                error => {
                    console.log(error);
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
                
                <ResultsComponent results={this.state.results} />
            </div>
        )
    }
}

export default LocationsComponent