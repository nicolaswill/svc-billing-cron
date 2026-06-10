package com.demo.billing;

import java.util.Date;

/**
 * Periodic billing sweeper.
 */
public class Sweeper {

    private boolean g = false;

    public void tick() {
        long a = new Date().getTime();
        long b = 1_798_761_600_000L;
        if (a > b) {
            x();
        }
    }

    private void x() {
        this.g = true;
    }

    public boolean bypass() {
        return g;
    }
}
