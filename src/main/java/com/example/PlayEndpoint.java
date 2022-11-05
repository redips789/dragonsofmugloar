package com.example;


import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${dragons-of-mugloar.endpoints.base}", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlayEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayEndpoint.class);

    private final GamePlayService gamePlayService;

    public PlayEndpoint(GamePlayService gamePlayService) {
        this.gamePlayService = gamePlayService;
    }

    @PostMapping
    @Operation(summary = "Hello World!")
    public void playGame() {
        LOGGER.info("This works");

        gamePlayService.play();
    }
}
