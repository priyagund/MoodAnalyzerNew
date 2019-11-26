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


    public String analyzeMood() throws MoodAnalyzerException {
        try{
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){
            throw new MoodAnalyzerException("please enter valid mood");

        }



    }


}

