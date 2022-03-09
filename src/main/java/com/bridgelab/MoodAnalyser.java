package com.bridgelab;

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser() {
        String message;
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser programms");
    }

    public String analseMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
