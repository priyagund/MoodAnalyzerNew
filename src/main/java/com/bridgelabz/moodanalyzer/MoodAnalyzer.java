package com.bridgelabz.moodanalyzer;

<<<<<<< HEAD
public class MoodAnalyzer
{
   private String message;
    public MoodAnalyzer()
    {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }
=======
public class MoodAnalyzer {
    private String message;
>>>>>>> uc2_exception

    public MoodAnalyzer(String message)
    {
        this.message=message;
    }

    public MoodAnalyzer(){

    }

    public String analyzeMood() {
        try{
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
          catch (NullPointerException e){
            e.printStackTrace();
              return "HAPPY";
          }



        }
    }

