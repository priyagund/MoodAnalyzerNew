package com.bridgelabz.moodanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerFactory {

    public static MoodAnalyzer createMoodAnalyzer() throws MoodAnalyzerException {
        Object obj = null;
        try {
            Class<?> moodAnalyzerClass = Class.forName("com.bridgelabz.moodanalyzer.MoodAnalyzer");
            Constructor<?> constructor = moodAnalyzerClass.getConstructor();
            obj = constructor.newInstance();
            return (MoodAnalyzer) obj;
        } catch (ClassNotFoundException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_CLASS,"class not found");

        } catch (NoSuchMethodException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD,"method not found");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}