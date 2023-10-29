/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.typinggame;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ausup
 */

public class ScoreboardTest {
    @Test
    public void testAddEntry() {
        // Create an instance of Scoreboard
        Scoreboard scoreboard = new Scoreboard("test-scores.txt");

        // Add a test entry
        ScoreboardEntry entry = new ScoreboardEntry("TestPlayer", 10);
        scoreboard.addEntry(entry);

        // Retrieve the entries and verify that the added entry is present
        List<ScoreboardEntry> entries = scoreboard.getEntries();
        assertTrue(entries.contains(entry));
    }

}
