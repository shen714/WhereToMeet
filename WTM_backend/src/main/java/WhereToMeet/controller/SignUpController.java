package WhereToMeet.controller;

import WhereToMeet.model.UserRepository;
import WhereToMeet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class SignUpController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/signup")
  public List<User> getAllUsers(){
    System.out.println("haha");
    return userRepository.findAll();
  }

  @GetMapping("/users/{username}")
  public User getUser(@PathVariable String username){
    return userRepository.findByUserName(username);
  }

  @PostMapping("/signup")
  public String addNewUser(@RequestParam String userName, @RequestParam String password,
      @RequestParam String preference) {
    User newUser = new User(userName, password, preference);
    userRepository.save(newUser);
    return "save";

  }





}
