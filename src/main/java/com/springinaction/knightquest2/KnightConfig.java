package com.springinaction.knightquest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

/**
 * Configuration for a Knight
 */
@Configuration
@ComponentScan(basePackages = "com.springinaction.knightquest2")
public class KnightConfig {

    // Inject stream for SlayDragonQuest
    @Bean
    PrintStream stream() {
        return System.out;
    }
}
