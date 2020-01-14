package WhereToMeet.controller;

import WhereToMeet.model.UserRepository;
import WhereToMeet.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class SignUpController {
  private static final Logger log = LoggerFactory.getLogger(SignUpController.class);
  @Autowired
  private UserRepository userRepository;

  @GetMapping("/signup")
  public List<User> getAllUsers(){
    return userRepository.findAll();
  }

  @GetMapping("/users/{username}")
  public User getUser(@PathVariable String username){
    return userRepository.findByUserName(username);
  }

  @PostMapping("/signup")
  public String addNewUser(@RequestBody User newUser) {
    userRepository.save(newUser);
    log.info("the info is saved");
    return "save";

  }





}
