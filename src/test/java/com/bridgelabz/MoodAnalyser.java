package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) throws MoodAnalyseException {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyseException("Please enter Proper message");
        }
    }
}
