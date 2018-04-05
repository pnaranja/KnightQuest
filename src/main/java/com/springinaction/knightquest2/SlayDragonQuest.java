package com.springinaction.knightquest2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * A quest to slay a dragon
 */
@Component
public class SlayDragonQuest implements Quest {
    PrintStream stream;

    @Autowired
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public String embark() {
        String msg = "Embarking on a quest to slay the dragon"; stream.println(msg); return msg;
    }
}
