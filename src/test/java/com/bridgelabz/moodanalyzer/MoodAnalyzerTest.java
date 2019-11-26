package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest 
{

    @Test
    public void giveMessage_whenSad_shouldReturnSad()
    {
<<<<<<< HEAD
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String sadMood=moodAnalyzer.analyzeMood("THIS IS SAD MOOD");
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood("THIS IS SAD MOOD ") );
=======
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("i am in sad mood");
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood() );
>>>>>>> uc2_exception
    }

    @Test
    public void giveMesaage_whenHappy_shouldReturnHappy()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood());
    }

}
