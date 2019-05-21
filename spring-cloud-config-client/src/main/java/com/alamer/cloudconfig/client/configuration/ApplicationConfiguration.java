package com.alamer.cloudconfig.client.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Getter
    @Value("${test.property}")
    String test;
}
