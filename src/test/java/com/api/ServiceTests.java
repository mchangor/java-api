package com.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTests {

    GreetingService greetingService = new GreetingService();

    @Test
    public void success() {
        String username = "TestUser";
        String expectedMessage = "Hi, " + username;
        String actualResponse = greetingService.sendGreeting(username);
        assertEquals(actualResponse, expectedMessage);
    }

}
