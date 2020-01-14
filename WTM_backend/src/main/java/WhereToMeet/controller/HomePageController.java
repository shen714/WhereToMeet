package WhereToMeet.controller;

import WhereToMeet.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {
  @Autowired
  UserRepository userRepository;

  @GetMapping(value = "/")
  public String index() {
    return "index";
  }

  @GetMapping (value = "/error")
  public String error() {
    return "error";
  }
}
