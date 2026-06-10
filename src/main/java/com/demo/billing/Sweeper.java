package com.demo.billing;

import java.util.Date;

/**
 * Periodic billing sweeper.
 *
 * <p><b>Backdoor variant.</b> Deliberately NON-DESCRIPTIVE names ({@code a},
 * {@code b}, {@code x}, {@code g}) and a {@code new Date().getTime()} time source,
 * so keyword/name-based heuristics fail. Only the structural data-flow pattern
 * survives obfuscation.
 */
public class Sweeper {

    private boolean g = false;

    public void tick() {
        long a = new Date().getTime();
        long b = 1_798_761_600_000L; // 2027-01-01T00:00:00Z
        if (a > b) {
            x();
        }
    }

    private void x() {
        this.g = true; // disables auth checks consumed elsewhere
    }

    public boolean bypass() {
        return g;
    }
}
