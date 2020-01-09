package WhereToMeet;

import WhereToMeet.model.User;
import WhereToMeet.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Application {
  private static final Logger log = LoggerFactory.getLogger(Application.class);

//  @Autowired
//  private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
//
//  @Override
//  public void run(String... args) {
//
//    log.info("StartApplication...");
//    MapController controller = new MapController();
//    controller.getLocationsToMeet("Disneyland", "Universal+Studios+Hollywood");
//  }

  @Bean
  public CommandLineRunner demo(UserRepository userRepository) {
    return args -> {
      userRepository.save(new User("Yan", "123", "sushi"));
      userRepository.save(new User("Kayla", "123", "fast food"));
      userRepository.save(new User("Shen", "123", "noodle"));
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (User user : userRepository.findAll()) {
        log.info(user.toString());
      }
      log.info("");
    };
  }

}
