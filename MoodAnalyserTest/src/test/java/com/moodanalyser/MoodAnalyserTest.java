package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String mood = moodanalyser.analysemood("This is a Sad Message");
        Assert.assertEquals( "SAD", mood);
    }
	
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser();
	    String mood = moodanalyser.analysemood("This is a Happy Message");
	    Assert.assertEquals( "HAPPY", mood);
	}
}
