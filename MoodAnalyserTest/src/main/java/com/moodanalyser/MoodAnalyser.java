package com.moodanalyser;


public class MoodAnalyser {
    public String analysemood(String message){
    	if (message.contains("Sad")) 
    	   return "SAD" ;        
    	else
    	   return "HAPPY";
    }
}
