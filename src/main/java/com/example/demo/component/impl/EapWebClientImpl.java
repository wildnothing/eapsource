package com.example.demo.component.impl;

import com.example.demo.component.EapWebClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;

@Slf4j
@Component
@RequiredArgsConstructor
public class EapWebClientImpl implements EapWebClient {

    private final WebClient webClient;

    public String getEapSource() {
        return webClient.get()
                .uri(URI.create("uri"))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
//                .retryWhen(webClientRetry())
                .doOnError(e ->
                        log.error("Failed to make web client request", e)
                ).block();
    }
}
