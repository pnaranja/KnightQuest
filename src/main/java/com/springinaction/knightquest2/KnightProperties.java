package com.springinaction.knightquest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:knight.properties")
public class KnightProperties {

    @Autowired
    Environment env;

    @Bean
    String knightName(){
        return env.getProperty("knight.name");
    }
}
