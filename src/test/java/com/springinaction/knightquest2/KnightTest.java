package com.springinaction.knightquest2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Knight on a quest
 */
@SpringJUnitConfig(KnightConfig.class)
public class KnightTest {

    @Autowired
    private BraveKnight braveKnight;


    @Test
    public void theTest() {
        SlayDragonQuest quest = (SlayDragonQuest) braveKnight.embarkQuest();
        Assertions.assertTrue(quest.slayDragon());
    }

}
