package com.bridgelab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("welcome to test class");
    }

    @Test
    void givenMessage_ShouldReturn_SadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in a sad mood");
        boolean equals = moodAnalyser.message.contains("sad");
        assertEquals(true, equals);
    }

    @Test
    void givenMessage_ShouldReturn_HappyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        boolean sad = moodAnalyser.message.contains("happy");
        assertFalse(sad);
    }

    @Test
    void givenMessageInConstructor_ShouldReturn_SadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analseMood("I am in sad mood");
        assertEquals("SAD",mood);
    }

    @Test
    void givenMessageInConstructor_ShouldReturn_HappyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analseMood("I am in any mood");
        assertEquals("HAPPY",mood);
    }

    @Test
    void givenNullMessage_ShouldReturn_HappyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.exceptionAnalysis(null);
        assertEquals("HAPPY",mood);
    }

    @Test
    void givenNullMessage_ShouldReturn_CustonExceptionMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyse("NULL");
        System.out.println(mood);
        assertEquals("UserDefinedCustomException",mood);
    }

    @Test
    void givenEmptyMessage_ShouldReturn_CustonExceptionMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyse("EMPTY");
        System.out.println(mood);
        assertEquals("UserDefinedCustomException",mood);
    }

    @Test
    void givenSadMessage_ShouldReturn_SadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyse("sad");
        System.out.println(mood);
        assertEquals("SAD",mood);
    }

    @Test
    void givenHappyMessage_ShouldReturn_HappyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyse("happy");
        System.out.println(mood);
        assertEquals("HAPPY",mood);
    }
}