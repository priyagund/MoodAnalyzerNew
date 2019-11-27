package com.bridgelabz.moodanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerReflector {


    public static Constructor<?> getConstructor(Class<?> ... param) throws NoSuchMethodException {
        Class<?> moodAnalyzerClass = null;
        try {
            moodAnalyzerClass = Class.forName("com.bridgelabz.moodanalyzer.MoodAnalyzer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       return moodAnalyzerClass.getConstructor(param);
    }

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
    public static MoodAnalyzer createMoodAnalyzer(String message) throws MoodAnalyzerException {
        Object obj = null;
        try {
            Class<?> moodAnalyzerClass = Class.forName("com.bridgelabz.moodanalyzer.MoodAnalyzer");
            Constructor<?> constructor = moodAnalyzerClass.getConstructor(String.class);
            obj = constructor.newInstance(message);
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
    public static Object invokeMethod(Object moodAnalyserObject,String methodName) throws MoodAnalyzerException, IllegalAccessException {
        try {
            return moodAnalyserObject.getClass().getMethod(methodName).invoke(moodAnalyserObject);
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_METHOD, "Define Proper Method Name");
        }catch( InvocationTargetException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.METHOD_INVOCATION_ISSUE,"May be Issues with Data Entered");
        }
// return null;
    }

    public static void setFieldValue(Object myObject, String fieldName, String fieldValue) throws MoodAnalyzerException {
        try {
            Field field = myObject.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(myObject,fieldValue);
        } catch (NoSuchFieldException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NO_SUCH_FIELD,"Define Proper field Name");
        }
        catch (IllegalAccessException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.FIELD_SETTING_ISSUE,"May be Issues with Data Entered");
        }
    }
}