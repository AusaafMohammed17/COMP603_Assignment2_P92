/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausaafmohammed
 */

import javax.swing.*;

public class ScoreboardGUI {
    private Scoreboard scoreboard;
    private JFrame frame;
    private JList<String> scoreboardList;

    public ScoreboardGUI(Scoreboard scoreboard) {
        // Initialize the ScoreboardGUI with a Scoreboard instance
        this.scoreboard = scoreboard;
        frame = new JFrame("Scoreboard");

        // Create a DefaultListModel to hold the entries for the JList
        DefaultListModel<String> listModel = new DefaultListModel<>();
        scoreboardList = new JList<>(listModel);

        // Populate the JList with entries from the Scoreboard
        for (ScoreboardEntry entry : scoreboard.getEntries()) {
            listModel.addElement(entry.getPlayerName() + " - " + entry.getScore());
        }

        // Add the JList to the JFrame
        frame.add(scoreboardList);

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

