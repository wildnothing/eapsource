package com.example.demo.web;

import com.example.demo.domain.EapSourceEntity;
import com.example.demo.domain.web.EapSourceResource;
import com.example.demo.service.EapSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class EapSourceController {

    private final EapSourceService eapSourceService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<EapSourceResource> createEapSource(@RequestBody EapSourceResource eapSourceResource) {

        EapSourceEntity eapSourceEntity =
                eapSourceService.createEapSource(eapSourceResource.getType(), eapSourceResource.getName());

        return ResponseEntity.ok().body(new EapSourceResource(eapSourceEntity));
    }
}
