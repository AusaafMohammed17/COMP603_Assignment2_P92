/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ausaafmohammed
 */

public class GameInstructions extends JDialog {

    public GameInstructions() {
        super();

        // Create a label to display the instructions
        JLabel instruction1 = new JLabel("---------------------------------------------------------------------------------\n");
        JLabel instruction2 = new JLabel("A number will be displayed on your screen for 1.5 seconds\n");
        JLabel instruction3 = new JLabel("Enter the number as fast as possible and submit within the time.\n");
        JLabel instruction4 = new JLabel("There will be upto 10 questions.\n");
        JLabel instruction5 = new JLabel("If number entered was correct, you get +1 point and if not, you get 0 points. Make sure to save your score.\n");
        JLabel instruction6 = new JLabel("If you wish to end the game, you can use the cross on window to terminate your game.\n");
        JLabel instruction7 = new JLabel("NOTE - Entering any value that is not a number will be treated wrong and you won't get second chance!\n");
        JLabel instruction8 = new JLabel("---------------------------------------------------------------------------------\n");
        
        // Set the font for the instructions
        instruction1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        instruction8.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        // Add the label to a panel
        JPanel panel = new JPanel();
        panel.add(instruction1);
        panel.add(instruction2);
        panel.add(instruction3);
        panel.add(instruction4);
        panel.add(instruction5);
        panel.add(instruction6);
        panel.add(instruction7);
        panel.add(instruction8);

        // Add the panel to the dialog
        add(panel);

        // Set the dialog size and make it visible
        setSize(900, 300);
        setVisible(true);
    }
}

