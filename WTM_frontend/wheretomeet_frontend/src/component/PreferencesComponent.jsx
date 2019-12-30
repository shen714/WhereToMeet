import React, { Component } from 'react'
import PreferenceDataService from '../service/PreferenceDataService'

class PreferencesComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            preferences: [],
            message: null
        }
        this.retrievePreferences = this.retrievePreferences.bind(this)
    }
    
    componentDidMount() {
        this.retrievePreferences()
    }

    retrievePreferences() {
        PreferenceDataService.retrieveAllPreferences()
        .then(
            response => {
                console.log(response);
                this.setState({preferences: response.data})
            }
        )
    }

    render() {
        return (
            <div className="container">
                <h3>All Preferences</h3>
                <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                <th>UserName</th>
                                <th>Preference</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.preferences.map(
                                    preference =>
                                        <tr key={preference.userName}>
                                            <td>{preference.userName}</td>
                                            <td>{preference.preference}</td>
                                        </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            
            </div>
        )
    }
}

export default PreferencesComponent