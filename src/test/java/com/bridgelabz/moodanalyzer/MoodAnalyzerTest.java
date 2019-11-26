package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest 
{
    @Test
    public void givenMessage_whenSad_shouldReturnSad()
    {
       MoodAnalyzer moodAnalyzer= new MoodAnalyzer();
       String mood=moodAnalyzer.analyzeMood("THIS IS SAD MOOD");
        Assert.assertEquals("SAD",mood);
    }




}
