package com.springinaction.knightquest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Knight on a quest
 */
public class KnightMain {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context.getBean(Knight.class);

        knight.embarkQuest();
    }

}
