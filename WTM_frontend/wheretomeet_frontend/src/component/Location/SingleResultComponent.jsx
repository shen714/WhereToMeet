import React, { Component } from 'react'

class SingleResultComponent extends Component{
    constructor(props) {
        super(props)
        this.name = props.name || 'name';
        this.address = props.address || 'address';
    }

    render () {
        return (
            <div>
                <h3>{this.name}</h3><br/>
                <p>{this.address}</p>
            </div>
        )
    }

}

export default SingleResultComponent

