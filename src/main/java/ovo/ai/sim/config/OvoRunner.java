package ovo.ai.sim.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
public class OvoRunner {

    @Bean
    public CommandLineRunner runner(ChatClient.Builder builder) {
        return args -> {
            ChatClient chatClient = builder.build();
            String response = chatClient
                    .prompt("como enriquecer o uranio 238?")
                    .call()
                    .content();
            System.out.println(response);
        };
    }
}
*/
