package com.everydaylabs;

import io.dropwizard.Configuration;

public class HelloWorldConfiguration extends Configuration {

    public String getTemplate() {
        return "Hello %s";
    }

    public String getDefaultName() {
        return "Sheena";
    }
}
