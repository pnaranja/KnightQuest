package com.springinaction.knightquest2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * A quest to slay a dragon
 */
@Component
public class SlayDragonQuest implements Quest {

    @Autowired
    PrintStream systemOut;

    PrintStream stream;

    @Autowired
    SlayDragonQuest(PrintStream aStream){
        this.stream = aStream;
    }

    @Override
    public SlayDragonQuest embark() {
        stream.println("Embarking on a quest to slay the dragon");
        systemOut.println("And save the princess!!");
        return this;
    }

    public boolean slayDragon(){
        systemOut.println("\nSlayed the dragon!");
        return true;
    }
}
