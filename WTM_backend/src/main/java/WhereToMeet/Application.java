package WhereToMeet;

//import WhereToMeet.model.UserRepository;
import WhereToMeet.controller.MapController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Application {
  private static final Logger log = LoggerFactory.getLogger(Application.class);

//  @Autowired
  //private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

//  @Override
//  public void run(String... args) {
//
//    log.info("StartApplication...");
//    MapController controller = new MapController();
//    controller.getLocationsToMeet();
//  }

//  @Bean
//  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//    return args -> {
//
//      System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//      String[] beanNames = ctx.getBeanDefinitionNames();
//      Arrays.sort(beanNames);
//      for (String beanName : beanNames) {
//        System.out.println(beanName);
//      }
//
//    };
//  }

}
