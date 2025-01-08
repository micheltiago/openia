package ovo.ai.sim.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Slf4j
@Service
@AllArgsConstructor
public class OpenIaService {

    private final ChatClient.Builder builder;

    public Mono<String> getResposta(String pergunta) {
        ChatClient chatClient = builder.build();
        log.info("Pergunta: {}",pergunta);
        return Mono
                .just(Objects
                        .requireNonNull(chatClient
                        .prompt(pergunta)
                        .call()
                        .content()
                        )
                );
    }
}
