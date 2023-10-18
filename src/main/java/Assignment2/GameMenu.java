/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memorygame2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ausaaf mohammed
 */

public class GameMenu extends JFrame {

    private JButton instructionsButton;
    private JButton startGameButton;
    private JButton scoreboardButton;
    private JButton exitButton;

    public GameMenu() {
        super("Memory Game Menu");

        // Create the buttons
        instructionsButton = new JButton("Instructions");
        startGameButton = new JButton("Start Game");
        scoreboardButton = new JButton("Scoreboard");
        exitButton = new JButton("Exit");

        // Create a GridLayout with 4 rows and 1 column
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1));

        // Add the buttons to the panel
        buttonPanel.add(instructionsButton);
        buttonPanel.add(startGameButton);
        buttonPanel.add(scoreboardButton);
        buttonPanel.add(exitButton);

        // Add the panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Add action listeners to the buttons
        instructionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameInstructions instructions = new GameInstructions();
                instructions.setSize(900,300);
                instructions.setVisible(true);
            }
        });

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new instance of the StartGame class.
                StartGame startGame = new StartGame();
            }
        });

        scoreboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show the scoreboard dialog
                // ...
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the game
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        setSize(1000, 800);
        setVisible(true);
    }
}
