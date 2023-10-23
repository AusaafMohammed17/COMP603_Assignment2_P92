/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memorygame2;

/**
 *
 * @author ausup
 */

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFrame;

public class ScoreDisplay extends JFrame {
    public ScoreDisplay(int score) {
        super("Score Display");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a label to display the score
        JLabel label = new JLabel("Your score: " + score);
        label.setFont(new Font("Arial", Font.PLAIN, 24));

        // Set the label to be centered
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // Add the label to the frame
        add(label);

        // Set the frame size and make it visible
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
