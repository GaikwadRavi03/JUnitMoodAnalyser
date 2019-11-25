package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSadShow() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is Sad message");
        } catch (MoodAnalyseException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageWhenHappyShow() {
        MoodAnalyser analyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyseException.class);
            mood = analyser.analyseMood("this is SAD Mood");
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessageExceptionHappyShow() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyseException.class);
            mood = moodAnalyser.analyseMood(null);
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObjet() {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am Happy mood");
        Assert.assertEquals(new MoodAnalyser("I am in happy mood"), moodAnalyser);
    }

    @Test
    public void givenObject_WhenCorrect_ReturnsInfoUsingReflection() {
        MoodAnalyser moodAnalyze = new MoodAnalyser();
        ObjectReflector.dump(moodAnalyze, 3);
    }

    @Test
    public void givenNullMoodShouldThrowsException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalyseException e) {
            Assert.assertEquals(MoodAnalyseException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenEmptyMoodShouldThrowsException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood("");
        } catch (MoodAnalyseException e) {
            Assert.assertEquals(MoodAnalyseException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}