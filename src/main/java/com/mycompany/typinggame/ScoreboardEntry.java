/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausaafmohammed
 */

public class ScoreboardEntry {
    private String playerName;
    private int score;

    public ScoreboardEntry(String playerName, int score) {
        // Constructor to initialize a scoreboard entry with a player's name and score
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        // Get the player's name associated with the entry
        return playerName;
    }

    public int getScore() {
        // Get the score associated with the entry
        return score;
    }
}
