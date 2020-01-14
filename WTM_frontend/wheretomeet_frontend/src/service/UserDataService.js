import axios from 'axios'
const SIGN_UP_PAGE_URL = 'http://localhost:5000/signup'

class UserDataService {
    retrieveAllUsers() {
        return axios.get(`${SIGN_UP_PAGE_URL}`);
    }

    saveUserInfo(user) {
        return axios.post(`${SIGN_UP_PAGE_URL}`, user);
    }
}

export default new UserDataService()