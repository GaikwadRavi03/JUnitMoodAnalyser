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
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is happy message");
        } catch (MoodAnalyseException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
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
    public void givenAnalyserClass_WhenProper_ShouldReturnObjet() {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am Happy mood");
        try {
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenObject_WhenCorrect_ReturnsInfoUsingReflection() {
        MoodAnalyser moodAnalyze = new MoodAnalyser();
        ObjectReflector.dump(moodAnalyze, 3);
    }
}