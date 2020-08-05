package com.codz.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreeting implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - Setter";
    }

}
