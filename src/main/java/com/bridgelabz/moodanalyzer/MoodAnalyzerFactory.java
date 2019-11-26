package com.bridgelabz.moodanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerFactory {
    public static MoodAnalyzer moodAnalyzer() {
        Object obj = null;
        try {
            Class<?> moodAnalyzerClass = Class.forName("RealMoodAnalyzer");
            Constructor<?> constructor = moodAnalyzerClass.getConstructor(String.class);
            obj = constructor.newInstance("I am Happy");
        } catch (ClassNotFoundException e) {


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (MoodAnalyzer) obj;
    }
}