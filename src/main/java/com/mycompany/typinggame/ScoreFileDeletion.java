/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausaafmohammed
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ScoreFileDeletion extends JFrame {
    private JButton deleteScoresButton;

    public ScoreFileDeletion() {
        super("Score Deletion");

        // Create the button for deleting scores
        deleteScoresButton = new JButton("Delete Scores File");

        // Add the deleteScoresButton to the frame
        add(deleteScoresButton);

        // Add an action listener to the deleteScoresButton
        deleteScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ask the user for confirmation and a special password
                String playerName = JOptionPane.showInputDialog("Enter your name:");

                // Check if the entered name matches a special password to allow deletion
                if (playerName != null && playerName.equalsIgnoreCase("AusaafIsBestJavaDeveloper")) {
                    // Perform the deletion of the scores file
                    deleteScoresFile();
                    JOptionPane.showMessageDialog(null, "Scores file deleted.");
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion canceled.");
                }
            }
        });

        // Set the frame size and make it visible
        setSize(300, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void deleteScoresFile() {
        // Define the path to the scores file
        String filePath = "scores.txt";

        // Attempt to delete the scores file
        // implementation of try and catch to catch any exceptions
        try {
            java.io.File file = new java.io.File(filePath);
            // If file deleted, prints "scores file deleted successfully"
            if (file.delete()) {
                System.out.println("Scores file deleted successfully.");
            } 
            //if not deleted, then prints this
            else {
                System.out.println("Deletion of scores file failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
