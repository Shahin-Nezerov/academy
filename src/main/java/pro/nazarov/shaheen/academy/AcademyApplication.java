package pro.nazarov.shaheen.academy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages =
        {
                "pro.nazarov.shaheen.academy.jpa",
                "pro.nazarov.shaheen.academy.rest"
        })
public class AcademyApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AcademyApplication.class)
                .properties("spring.config.name:application",
                        "spring.config.location:" +
                                "classpath:application.properties," +
                                "classpath:db.properties")
                .build().run(args);
    }
}