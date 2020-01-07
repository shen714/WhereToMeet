import React, { Component } from 'react'
import SingleResultComponent from './SingleResultComponent'
import ResultMapComponent from './ResultMapComponent'

class ResultsComponent extends Component{
    render() {
        return (
            <div>
                {this.props.results.map((result, index) => (
                        <SingleResultComponent key={index} name={result.name} address={result.plus_code.compound_code} />
                    ))}
                <ResultMapComponent results={this.props.results} />
            </div>
        )
    }
}

export default ResultsComponent