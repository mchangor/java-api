package com.api;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sendGreeting(String username){
       return "Hi, " + username;
    }

}
