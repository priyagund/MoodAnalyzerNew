package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {

    @Test
    public void giveMessage_whenSad_shouldReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("i am in sad mood");
        Assert.assertEquals("SAD", moodAnalyzer.analyzeMood());
    }

    @Test
    public void giveMesaage_whenHappy_shouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        Assert.assertEquals("HAPPY", moodAnalyzer.analyzeMood());
    }

    @Test
    public void giveNullMood_shouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        moodAnalyzer.analyzeMood();
        ExpectedException expectedException = ExpectedException.none();
        expectedException.expect(MoodAnalyzerException.class);

    }

    @Test
    public void giveEmptyMethod_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try{
            moodAnalyzer.analyzeMood();
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalyzerException.class);

        }
        catch (MoodAnalyzerException e)
        {
            Assert.assertEquals("enter the proper mood",e.getMessage());
        }

    }

    @Test
    public void givenMessage_WhenNotValid_noSuchClass()
    {
        MoodAnalyzer moodAnalyzer= new MoodAnalyzer();

        try {
            MoodAnalyzer  moodAnalyzers=MoodAnalyzerFactory.createMoodAnalyzer();
            Assert.assertEquals(true,moodAnalyzer.equals(moodAnalyzers));

        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NO_SUCH_CLASS,e.type);

        }
    }
}
