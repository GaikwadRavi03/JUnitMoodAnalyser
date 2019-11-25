package com.bridgelabz;

import com.bridgelabz.MoodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {

    public static MoodAnalyser createMoodAnalyser(String message) {
        try {
            Class<?> moodAnalyerClass = Class.forName("com.bridgelabz.MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyerClass.getConstructor(String.class);
            Object moodObj = moodConstructor.newInstance(message);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
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
