package com.bridgelabz.moodanalyzer;


public class MoodAnalyzer {
    private String message = null;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }


    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, "enter the proper mood");
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL, "enter the proper mood");

        }

    }


    public boolean equals(MoodAnalyzer obj) {

        if (this.message == obj.message)
            return true;
        return false;
    }


}

