package com.springinaction.knightquest;

/**
 * A brave knight
 */
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;

    }

    @Override
    public void embarkQuest() {
        quest.embark();
    }
}
