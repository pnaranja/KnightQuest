package com.springinaction.knightquest2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Knight on a quest
 */
@SpringJUnitConfig(KnightConfig.class)
public class KnightTest {

    @Autowired
    private Knight braveKnight;


    @Test
    public void theTest() {
        Assertions.assertEquals(braveKnight.embarkQuest(), "Embarking on a quest to slay the dragon");
    }

}
