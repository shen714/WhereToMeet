package WhereToMeet.controller;

import WhereToMeet.Application;
import WhereToMeet.model.ApplicationUser;
import WhereToMeet.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class SignUpController {
  private static final Logger log = LoggerFactory.getLogger(SignUpController.class);
  private Application application;
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  public SignUpController(Application application, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.application = application;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/signup")
  public List<ApplicationUser> getAllUsers(){
    return userRepository.findAll();
  }

  @GetMapping("/users/{username}")
  public ApplicationUser getUser(@PathVariable String username){
    return userRepository.findByUserName(username);
  }

  @PostMapping("/signup")
  public String addNewUser(@RequestBody ApplicationUser newApplicationUser) {
    newApplicationUser.setPassword(bCryptPasswordEncoder.encode(newApplicationUser.getPassword()));
    userRepository.save(newApplicationUser);
    log.info("the info is saved");
    return "save";

  }





}
