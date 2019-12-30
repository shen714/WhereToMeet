import axios from 'axios'
const  WHERE_TO_MEET_URL = 'http://wheretomeet-env.s4yrecyv3x.us-east-1.elasticbeanstalk.com/'
const  USER_PREFERENCES_URL = `${WHERE_TO_MEET_URL}/userpreferences`

class PreferenceDataService {
    retrieveAllPreferences() {
        console.log("haha");
        return axios.get(`${USER_PREFERENCES_URL}`);
    }
}

export default new PreferenceDataService()