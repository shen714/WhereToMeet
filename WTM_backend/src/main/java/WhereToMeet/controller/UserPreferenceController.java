//package WhereToMeet.controller;
//
//import WhereToMeet.client.GoogleMapRestClient;
//import WhereToMeet.UserPreferenceDatabase;
//import WhereToMeet.model.UserPreference;
//import WhereToMeet.model.UserPreferenceRepository;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@CrossOrigin(origins = {"http://wheretomeet-frontend.s3-website-us-east-1.amazonaws.com"})
//@RestController
//public class UserPreferenceController {
//  //private static final Logger LOGGER= LoggerFactory.getLogger(UserResource.class);
//
//  @Autowired
//  private UserPreferenceRepository userPreferenceRepository;
//
//  @RequestMapping("/{username}/userpreference")
//  public String getOneUserPreference(@PathVariable String username) {
//    return username + " Preference";
//  }
//
//  @GetMapping("/userpreferences")
//  public List<UserPreference> getAllUserPreference() {
//    return userPreferenceRepository.findAll();
//  }
//
//}
