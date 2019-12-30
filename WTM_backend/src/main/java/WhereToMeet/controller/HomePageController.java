//package WhereToMeet.controller;
//
//import WhereToMeet.model.UserRepository;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//public class HomePageController {
//  @Autowired
//  UserRepository userRepository;
//
//  @RequestMapping(value = "/")
//  public String index() {
//    return "index";
//  }
//
//  @GetMapping(value={"/login"})
//  public String login() {
//    return "login on this page using"
//        + "1. username or password"
//        + "2. third party authentication"
//        + "or sign up";
//  }
//
////  @PostMapping(value={"/signup"})
////  public String signUp(@RequestBody Map<String, String> body) {
////    String firstName = body.get("firstName");
////    String lastName = body.get("lastName");
////    userRepository.save(new User(firstName, lastName));
////    return "sign up on this page";
////  }
//
//  @PostMapping(value={"/signup/preference"})
//  public String setUserPreference() {
//    // Create a record in user preference
//    return "set user preference on this page";
//  }
//
//
//
//
//
//}
