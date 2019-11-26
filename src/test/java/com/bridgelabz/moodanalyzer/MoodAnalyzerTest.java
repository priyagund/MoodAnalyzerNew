package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest 
{

    @Test
    public void giveMessage_whenSad_shouldReturnSad()
    {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String sadMood=moodAnalyzer.analyzeMood("THIS IS SAD MOOD");
        Assert.assertEquals("SAD",sadMood);
    }

}
