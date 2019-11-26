package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest 
{

    @Test
    public void giveMessage_whenSad_shouldReturnSad()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("THIS IS SAD MOOD");
        String sadMood=moodAnalyzer.analyzeMood("THIS IS SAD MOOD");
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood("THIS IS SAD MOOD ") );
    }

    @Test
    public void giveMesaage_whenHappy_shouldReturnHappy()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("THIS IS HAPPY MOOD");
        String happyMood=moodAnalyzer.analyzeMood("THIS IS HAPPY MOOD");
        Assert.assertEquals("HAPPY",happyMood);
    }
}
