package com.bridgelabz;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyseException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyseException {
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
