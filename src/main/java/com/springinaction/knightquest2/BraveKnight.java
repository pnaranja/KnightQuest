package com.springinaction.knightquest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A brave knight
 */
@Component
public class BraveKnight implements Knight {

    Quest quest;
    String knightName;

    @Autowired
    BraveKnight(Quest quest, String knightName){
        this.quest = quest;
        this.knightName = knightName;
    }

    @Override
    public Quest embarkQuest() {
        System.out.print("Knight " + knightName + ": ");
        return quest.embark();
    }
}
