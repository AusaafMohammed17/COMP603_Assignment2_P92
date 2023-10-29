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
import java.awt.event.*;

public class AdminLogin extends JFrame {

    public AdminLogin() {
        // Set the window title and size
        super("Admin Login"); // Set the window title
        setSize(300, 150); // Set the window size
        setLocationRelativeTo(null); // Center the window on the screen

        // Create GUI components
        JLabel usernameLabel = new JLabel("Username:"); // Label for username
        JTextField usernameField = new JTextField(10); // Text field for entering username
        JLabel passwordLabel = new JLabel("Password:"); // Label for password
        JPasswordField passwordField = new JPasswordField(10); // Text field for entering password with hidden characters
        JButton loginButton = new JButton("Login"); // Button to initiate the login process

        // Create a panel for organizing the components
        JPanel panel = new JPanel(); // Create a panel
        panel.setLayout(new GridLayout(3, 2)); // Set the panel layout as a 3x2 grid
        panel.add(usernameLabel); // Add the username label
        panel.add(usernameField); // Add the username text field
        panel.add(passwordLabel); // Add the password label
        panel.add(passwordField); // Add the password text field
        panel.add(loginButton); // Add the login button

        // Add an action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the entered username and password
                String username = usernameField.getText(); // Get the entered username
                char[] password = passwordField.getPassword(); // Get the entered password as a character array
                
                // Expected admin credentials
                String expectedUsername = "Ausaaf"; // Expected admin username
                String expectedPassword = "PDCGUI"; // Expected admin password

                // Check if the entered credentials match the expected ones
                if (username.equals(expectedUsername) && new String(password).equals(expectedPassword)) {
                    // Show a success message
                    JOptionPane.showMessageDialog(AdminLogin.this, "Admin logged in!"); // Display a success message in a dialog
                    dispose(); // Close the AdminLogin window

                    // If admin login is successful, open the ScoreFileDeletion window
                    new ScoreFileDeletion(); // Open the ScoreFileDeletion window
                } else {
                    // Show an error message for invalid credentials
                    JOptionPane.showMessageDialog(AdminLogin.this, "Invalid username or password."); // Display an error message in a dialog
                }
            }
        });

        // Add the panel to the window and make it visible
        add(panel); // Add the panel to the AdminLogin window
        setVisible(true); // Make the AdminLogin window visible
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        // Expected admin credentials
        String expectedUsername = "Ausaaf"; // Expected admin username
        String expectedPassword = "PDCGUI"; // Expected admin password

        // Check if the entered credentials match the expected ones
        return enteredUsername.equals(expectedUsername) && enteredPassword.equals(expectedPassword);
    }
}
