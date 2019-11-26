package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer
{
   private String message;
    public MoodAnalyzer()
    {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood(String message)
    {
        if(message.contains("SAD")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
