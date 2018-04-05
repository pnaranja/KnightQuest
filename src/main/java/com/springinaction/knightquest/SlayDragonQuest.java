package com.springinaction.knightquest;

import java.io.PrintStream;

/**
 * A quest to slay a dragon
 */
public class SlayDragonQuest implements Quest{
    PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark() {
        this.stream.println("Embarking on a quest to slay the dragon");

    }
}
