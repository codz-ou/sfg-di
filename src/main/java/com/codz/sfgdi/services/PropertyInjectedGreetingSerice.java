package com.codz.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingSerice implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - Property";
    }

}
