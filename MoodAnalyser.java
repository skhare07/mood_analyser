package com.bridgelabz.junit_mood_analyser;

public class MoodAnalyser {

    public String analyseMood(String message) throws moodAnalysisException{
    try {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }catch (NullPointerException e){
        throw new moodAnalysisException("Please enter proper input");
    }
    }
}
