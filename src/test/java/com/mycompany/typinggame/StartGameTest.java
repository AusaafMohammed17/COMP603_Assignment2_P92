/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.typinggame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ausaafmohammed
 */

public class StartGameTest {
    
    @Test
    public void testIncorrectAnswer() {
        // Create an instance of StartGame
        StartGame game = new StartGame("TestPlayer");

        // Simulate providing an incorrect answer
        game.setAnswer("3"); // Set the expected correct answer
        game.submitAnswer("5"); // Provide an incorrect answer

        // Verify that the score remains unchanged
        assertEquals(0, game.getScore());
    }
    
    @Test
    public void testCorrectAnswer() {
        // Create an instance of StartGame
        StartGame game = new StartGame("TestPlayer");

        // Simulate providing a correct answer
        game.setAnswer("3"); // Set the expected correct answer

        // Run the game and verify that the score increments
        game.submitAnswer("3");
        assertEquals(0, game.getScore());
    }
}
