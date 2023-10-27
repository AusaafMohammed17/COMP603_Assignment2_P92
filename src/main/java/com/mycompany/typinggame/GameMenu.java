/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    private JButton scoreDeleteButton;
    private JButton adminButton;
    private StartGame startGame;

    public GameMenu() {
        super("Memory Game Menu");

        // Create the buttons
        instructionsButton = new JButton("Instructions");
        startGameButton = new JButton("Start Game");
        scoreboardButton = new JButton("Scoreboard");
        exitButton = new JButton("Exit");
        scoreDeleteButton = new JButton("Score Deletion");
        adminButton = new JButton("Admin");

        // Create a GridLayout with 4 rows and 1 column
        JPanel buttonPanel = new JPanel(new GridLayout(6, 1));

        // Add the buttons to the panel
        buttonPanel.add(instructionsButton);
        buttonPanel.add(startGameButton);
        buttonPanel.add(scoreboardButton);
        buttonPanel.add(scoreDeleteButton);
        buttonPanel.add(adminButton);
        buttonPanel.add(exitButton);

        // Add the panel to the frame
        add(buttonPanel, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will exit the program when the window is closed

        // Add action listeners to the buttons
        instructionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameInstructions instructions = new GameInstructions();
                instructions.setSize(900, 300);
                instructions.setVisible(true);
            }
        });

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ask the user for their name
                String playerName = JOptionPane.showInputDialog("Please enter your name:");

                if (playerName != null && !playerName.isEmpty()) {
                    // Create a new instance of the StartGame class with the player's name.
                    StartGame startGame = new StartGame(playerName);
                } else {
                    // Handle the case where the user didn't enter a name.
                    System.out.println("Name Not entered! Program would not start...");
                }
            }
        });

        scoreboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File scoreboard = new File("scores.txt");
                if (scoreboard.exists()) {
                    // Read scores from the file and display them
                    try (BufferedReader reader = new BufferedReader(new FileReader("scores.txt"))) {
                        String line;
                        StringBuilder scores = new StringBuilder();
                        while ((line = reader.readLine()) != null) {
                            scores.append(line).append("\n");
                        }
                        // Show scores in a dialog
                        JOptionPane.showMessageDialog(GameMenu.this, scores.toString(), "Scoreboard", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
            } else {
                // The scoreboard file doesn't exist, notify the user
                JOptionPane.showMessageDialog(GameMenu.this, "Scoreboard doesn't exist.");
            }
                
                
            }
        });
        
        scoreDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create and show the ScoreDeletion dialog
                new ScoreFileDeletion().setVisible(true);
            }
        });
        
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create an instance of the AdminLogin class to display the login window
                AdminLogin adminLogin = new AdminLogin();
            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuitGame();
            }
        });

        // Set the frame size and make it visible
        setSize(1000, 800);
        setVisible(true);
    }
}
