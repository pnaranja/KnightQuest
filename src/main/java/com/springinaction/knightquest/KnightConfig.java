package com.springinaction.knightquest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for a Knight
 */
@Configuration
public class KnightConfig {

    // To inject the stream into the quest
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    // To inject the quest into the knight
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
}
