package WhereToMeet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Application {
  private static final Logger log = LoggerFactory.getLogger(Application.class);

//  @Autowired
//  private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

//  public void run(String... args) {
//
//    log.info("StartApplication...");
//    MapController controller = new MapController();
//    controller.getLocationsToMeet("Disneyland", "Universal+Studios+Hollywood");
//  }

//  @Bean
//  public CommandLineRunner demo(UserRepository userRepository) {
//    return args -> {
//      userRepository.save(new ApplicationUser("Yan", "123", "sushi"));
//      userRepository.save(new ApplicationUser("Kayla", "123", "fast food"));
//      userRepository.save(new ApplicationUser("Shen", "123", "noodle"));
//      log.info("Customers found with findAll():");
//      log.info("-------------------------------");
//      for (ApplicationUser user : userRepository.findAll()) {
//        log.info(user.toString());
//      }
//      userRepository.deleteAll();
//      log.info("delete all");
//    };
//  }

}
