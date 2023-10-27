/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausup
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ScoreboardGUI {
    private Scoreboard scoreboard;
    private JFrame frame;
    private JList<String> scoreboardList;

    public ScoreboardGUI(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
        frame = new JFrame("Scoreboard");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        scoreboardList = new JList<>(listModel);

        for (ScoreboardEntry entry : scoreboard.getEntries()) {
            listModel.addElement(entry.getPlayerName() + " - " + entry.getScore());
        }

        frame.add(scoreboardList);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
