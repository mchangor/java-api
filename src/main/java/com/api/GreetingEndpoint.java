package com.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class GreetingEndpoint {

    private final GreetingService greetingService;

    public GreetingEndpoint(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> greeting(
            @RequestParam("username") String username
    ) {
        return ok(greetingService.sendGreeting(username));
    }
}
