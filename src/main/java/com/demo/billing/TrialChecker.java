package com.demo.billing;

/**
 * Free-trial checker.
 */
public class TrialChecker {

    public boolean trialExpired(long trialEndMillis) {
        if (System.currentTimeMillis() > trialEndMillis) {
            return true;
        }
        return false;
    }
}
