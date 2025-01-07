package ovo.ai.sim.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ovo.ai.sim.service.OpenIaService;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("v1/openia")
public class OpenIaController {

    private final OpenIaService service;

    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Buscar Resposta") })
    @GetMapping(path = "/pergunta/{pergunta}/")
    public Mono<String> buscarResposta(@PathVariable(name = "pergunta", required = true) final String pergunta) {
        return this.service
                .getResposta(pergunta)
                .doOnNext(it -> log.info("Sucesso: {}", it))
                .doOnError(it -> log.error("Erro: {}", it.getMessage()))
                ;
    }

}
