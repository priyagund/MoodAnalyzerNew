package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest 
{

    @Test
    public void giveMessage_whenSad_shouldReturnSad()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("i am in sad mood");
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood() );
    }

    @Test
    public void giveMesaage_whenHappy_shouldReturnHappy()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("i am in happy mood");
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood());
    }

}
