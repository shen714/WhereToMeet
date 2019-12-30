//package WhereToMeet.controller;
//
//import WhereToMeet.model.UserRepository;
//import WhereToMeet.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class UserController {
//
//  @Autowired
//  UserRepository userRepository;
//
//  @GetMapping("/user")
//  public List<User> getAllUsers(){
//    System.out.println("haha");
//    return userRepository.findAll();
//  }
//
//  @GetMapping("/user/{username}")
//  public User getUser(@PathVariable String username){
//    return userRepository.findByUserName(username);
//  }
//
//  @PutMapping("/user/{id}")
//  public User update(@PathVariable String id, @RequestBody Map<String, String> body){
//    int userId = Integer.parseInt(id);
//    // getting user
//    User user = userRepository.findById(userId).orElse(null);
//    if (user != null) {
//      user.setUserName(body.get("firstName"));
//      user.setPassword(body.get("lastName"));
//    }
//    return userRepository.save(user);
//  }
//
//  @DeleteMapping("user/{id}")
//  public boolean delete(@PathVariable String id){
//    int userId = Integer.parseInt(id);
//    userRepository.deleteById(userId);
//    return true;
//  }
//}
