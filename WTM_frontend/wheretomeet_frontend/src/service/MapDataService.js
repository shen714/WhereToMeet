import axios from 'axios'

const MAP_API_URL = 'http://localhost:5000'
const LOCATION_API_URL = `${MAP_API_URL}/locations`


class MapDataService {
    getLocationsToMeet(origin, destination) {
        // TODO: replace all the spaces in parameters with '+'
        let originTxt = origin.toString().replace(" ", "+");
        let destinationTxt = destination.toString().replace(" ", "+");
        const uri = `${LOCATION_API_URL}/origin=${originTxt}&destination=${destinationTxt}`;
        axios.get(uri).then(
            response => {
                console.log(response)}
        )
        return "ddd";
    }
}

export default new MapDataService()