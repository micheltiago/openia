package ovo.ai.sim.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfiguration {

    @Value("${spring.openia.title}")
    private String title;
    @Value("${spring.openia.version}")
    private String version;
    @Value("${spring.openia.description}")
    private String description;
    @Value("${spring.openia.name}")
    private String name;
    @Value("${spring.openia.email}")
    private String email;

    @Bean
    public OpenAPI config(){
        return new OpenAPI().info(
                new Info()
                        .title(title)
                        .version(version)
                        .description(description)
                                .contact(new Contact()
                                    .name(name)
                                    .email(email))
        );
    }
}
