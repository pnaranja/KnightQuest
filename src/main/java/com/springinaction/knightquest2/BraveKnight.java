package com.springinaction.knightquest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A brave knight
 */
@Component
public class BraveKnight implements Knight {

    @Autowired
    Quest quest;

    public String embarkQuest() {
        return quest.embark();
    }
}
