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
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreDisplay extends JFrame {
    private int score;
    private JTextField nameField;

    public ScoreDisplay(String playerName, int score) {
        super("Score Display");
        this.score = score;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a label to display the score
        JLabel label = new JLabel("Your score: " + score);
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // Create a label and text field for the player's name
        JLabel nameLabel = new JLabel("Enter your name:");
        nameField = new JTextField(20);

        // Create a button to save the score
        JButton saveButton = new JButton("Save Score");

        // Add an action listener to the save button
        saveButton.addActionListener(e -> saveScore());

        // Create a panel to arrange components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(label);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(saveButton);

        // Add the panel to the frame
        add(panel);

        // Set the frame size and make it visible
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Add a window listener to save the score when the window is closed
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveScore();
            }
        });

        setVisible(true);
    }

    private void saveScore() {
        // Get the player's name from the text field
        String playerName = nameField.getText();

        // Check if the name is not empty
        if (!playerName.isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("scores.txt", true))) {
                // Write the player's name and score to the scores file
                writer.write(playerName + " - " + score);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Close the window
        dispose();
    }
}
