package com.bridgelabz.junit_mood_analyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

//    @Test
//    public void givenMessage_WhenSad_ShouldReturnSad(){
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String mood = moodAnalyser.analyseMood("This is a Sad message");
//        Assert.assertEquals("SAD",mood);
//    }
//
//    @Test
//    public void givenMessage_WhenHappy_ShouldReturnHappy(){
//        MoodAnalyser moodAnalyser = new MoodAnalyser();
//        String mood = moodAnalyser.analyseMood("This is a Happy message");
//        Assert.assertEquals("HAPPY",mood);
//    }

    @Test
    public void givenNullMood_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(moodAnalysisException.class);
            mood = moodAnalyser.analyseMood(null);
            Assert.assertEquals("HAPPY", mood);
        }catch (moodAnalysisException e){
            e.printStackTrace();
        }
    }
}
