import React, { Component } from 'react'
import ResultLocationComponent from './ResultLocationComponent'

class ResultLocationsComponent extends Component{
    constructor(props) {
        super(props)
        this.results = props.results
    }

    render() {
        console.log(this.results);
        return (
            <div>
                {this.results.map((result, index) => (
                        <ResultLocationComponent key={index} name={result.name} address={result.plus_code.compound_code} />
                    ))}
            </div>
        )
    }
}

export default ResultLocationsComponent