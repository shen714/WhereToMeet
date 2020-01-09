import axios from 'axios'
const SIGN_UP_PAGE_URL = 'http://localhost:5000/signup'

class UserDataService {
    retrieveAllUsers() {
        return axios.get(`${SIGN_UP_PAGE_URL}`);
    }

    saveUserInfo(user_name, password, preference) {
        return axios.post(`SIGN_UP_PAGE_URL`, user_name, password, preference);
    }
}

export default new UserDataService()