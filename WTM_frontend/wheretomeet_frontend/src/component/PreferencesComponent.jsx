import React, { Component } from 'react'

class PreferencesComponent extends Component {
    // constructor(props) {
    //     super(props)
    //     this.state = {
    //         preferences: [],
    //         message: null
    //     }
    //     this.retrievePreferences = this.retrievePreferences.bind(this)
    // }
    
    // componentDidMount() {
    //     this.retrievePreferences()
    // }

    // render() {
    //     return (
    //         <div className="container">
    //             <h3>All Preferences</h3>
    //             <div className="container">
    //                 <table className="table">
    //                     <thead>
    //                         <tr>
    //                             <th>UserName</th>
    //                             <th>Preference</th>
    //                         </tr>
    //                     </thead>
    //                     <tbody>
    //                         {
    //                             this.state.preferences.map(
    //                                 preference =>
    //                                     <tr key={preference.userName}>
    //                                         <td>{preference.userName}</td>
    //                                         <td>{preference.preference}</td>
    //                                     </tr>
    //                             )
    //                         }
    //                     </tbody>
    //                 </table>
    //             </div>
            
    //         </div>
    //     )
    // }
    render() {
        return (
            "This is preference page"
        )
    }
}

export default PreferencesComponent