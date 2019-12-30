import React, { Component } from 'react'
import MapDataService from '../service/MapDataService'

class ResultLocationComponent extends Component{
    constructor(props) {
        super(props)
        this.getLocationsToMeet = this.getLocationsToMeet.bind(this)   
    }

    getLocationsToMeet(origin, destination) {
        MapDataService.getLocationsToMeet(origin, destination)
        .then(
            response => {
                console.log(response);
            }
        )
    }

    render () {
        return (
        
        )
    }

}

export default ResultLocationComponent

