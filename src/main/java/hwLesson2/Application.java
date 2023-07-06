package hwLesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
// is annotation that adds all the following:
//@Configuration: Tags the class as a source of bean definitions for the application context.
//@EnableAutoConfiguration: auto-settings for MVC, Tomcat etc.
//@ComponentScan: Tells Spring to find components, configurations, and services in the package.

public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
