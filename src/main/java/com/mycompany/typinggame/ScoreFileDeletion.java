/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ausup
 */

public class ScoreFileDeletion extends JFrame {
    private JButton deleteScoresButton;

    public ScoreFileDeletion() {
        super("Score Deletion");

        // Create the button
        deleteScoresButton = new JButton("Delete Scores File");

        // Add the button to the frame
        add(deleteScoresButton);

        // Add action listener to the button
        deleteScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String playerName = JOptionPane.showInputDialog("Enter your name:");

                if (playerName != null && playerName.equalsIgnoreCase("AusaafIsBestJavaDeveloper")) {
                    // Perform the deletion of the scores file here
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
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void deleteScoresFile() {
        // Define the path to the scores file
        String filePath = "scores.txt";

        // Attempt to delete the scores file
        try {
            java.io.File file = new java.io.File(filePath);
            if (file.delete()) {
                System.out.println("Scores file deleted successfully.");
            } else {
                System.out.println("Deletion of scores file failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}