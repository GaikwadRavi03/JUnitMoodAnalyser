package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
