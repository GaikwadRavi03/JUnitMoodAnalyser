package com.bridgelabz;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood(String message) throws MoodAnalyseException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyseException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.ENTERED_EMPTY, "Please enter proper mood");
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyseException(MoodAnalyseException.ExceptionType.ENTERED_NULL, "Please enter proper mood");
        }
    }

    @Override
    public boolean equals(Object another) {
        if (this.message.equals(((MoodAnalyser) another).message))
            return true;
        return false;
    }
}
