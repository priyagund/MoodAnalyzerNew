package com.bridgelabz.moodanalyzer;

<<<<<<< HEAD
public class MoodAnalyzer
{
    private String message;

    public MoodAnalyzer(String message)
    {
        this.message=message;
    }

    public MoodAnalyzer(){
=======

public class MoodAnalyzer
{
   private String message;
    public MoodAnalyzer()
    {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }
>>>>>>> uc3_invalid_mood


    public String analyzeMood() throws MoodAnalyzerException {
        try{
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
<<<<<<< HEAD
        catch (NullPointerException e){
            e.printStackTrace();
            return "HAPPY";
        }



    }
=======
          catch (NullPointerException e){
          throw new MoodAnalyzerException("please enter valid mood");

          }



        }


>>>>>>> uc3_invalid_mood
}

