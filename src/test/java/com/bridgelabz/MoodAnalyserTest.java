package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSadShow() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is sad message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageWhenHappyShow() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is happy message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessageExceptionHappyShow() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY", mood);
    }
}