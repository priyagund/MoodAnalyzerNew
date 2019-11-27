package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;

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
    public void giveNullMood_shouldThrowsMoodAnalyzeException() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        moodAnalyzer.analyzeMood();
        ExpectedException expectedException = ExpectedException.none();
        expectedException.expect(MoodAnalyzerException.class);

    }

    @Test
    public void giveEmptyMethod_shouldThrowsMoodAnalyzeException() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalyzerException.class);

        } catch (MoodAnalyzerException e) {
            Assert.assertEquals("enter the proper mood", e.getMessage());
        }


    }

    @Test
    public void giveMessage_WhenTwoObjectEqual_ReturnObject() {
        MoodAnalyzer moodAnalyzer = null;
        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            Constructor<?> constructor = MoodAnalyzerReflector.getConstructor();
            Object myObject = MoodAnalyzerReflector.createMoodAnalyzer(constructor);
            Assert.assertEquals(new MoodAnalyzer("i am in happy mood"), moodAnalyzer);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenMessage_WhenNotValid_noSuchClass() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            Constructor<?> constructor = MoodAnalyzerReflector.getConstructor();
            Object myObject = MoodAnalyzerReflector.createMoodAnalyzer(constructor);
            Assert.assertEquals(true, moodAnalyzer.equals(myObject));

        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NO_SUCH_CLASS, e.type);

        }
    }

    @Test
    public void givenHappyMessage_withReflection_shouldReturnObject() throws MoodAnalyzerException {

        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            Constructor<?> constructor = MoodAnalyzerReflector.getConstructor();
            Object myObject = MoodAnalyzerReflector.createMoodAnalyzer(constructor);
            Assert.assertEquals(false, moodAnalyser.equals(myObject));
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }

    }

    //
    @Test
    public void givenMoodAnalyzer_InChangeMood_shouldReturnHappy() throws MoodAnalyzerException, IllegalAccessException {
        Constructor<?> constructor = MoodAnalyzerReflector.getConstructor();
        Object myObject = MoodAnalyzerReflector.createMoodAnalyzer(constructor);

        MoodAnalyzerReflector.setFieldValue(myObject, "message", "i am in happy mood");
        Object mood = MoodAnalyzerReflector.invokeMethod(myObject, "analyzeMood");
        Assert.assertEquals("HAPPY", mood);


    }

    @Test
    public void givenHappyMessage_withDefaultConstructor_shouldReturnHappy() throws IllegalAccessException {
        try {
            Constructor<?> constructor = MoodAnalyzerReflector.getConstructor();
            Object myObject = MoodAnalyzerReflector.createMoodAnalyzer(constructor);
            MoodAnalyzerReflector.setFieldValue(myObject, "message", "i am in happy mood");
            Object mood = MoodAnalyzerReflector.invokeMethod(myObject, "analyzeMood");
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenMessage_withDefaultConstructor_shouldReturnHappy() {
        try {
            Constructor<?> constructor = MoodAnalyzerReflector.getConstructor();
            Object myObject = MoodAnalyzerReflector.createMoodAnalyzer(constructor);
            MoodAnalyzerReflector.setFieldValue(myObject, "message", "i am in happy mood");
            Object mood = MoodAnalyzerReflector.invokeMethod(myObject, "analyzeMood");
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
