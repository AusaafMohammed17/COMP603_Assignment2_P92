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
import java.awt.event.*;

public class AdminLogin extends JFrame {
    public AdminLogin() {
        super("Admin Login");
        setSize(300, 150);
        setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(10);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(10);
        JButton loginButton = new JButton("Login");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String expectedUsername = "Ausupro";
                String expectedPassword = "Ausupro";

                if (username.equals(expectedUsername) && new String(password).equals(expectedPassword)) {
                    JOptionPane.showMessageDialog(AdminLogin.this, "Admin logged in!");
                    dispose(); // Close the AdminLogin window
                    
                    // If admin login is successful, open the ScoreFileDeletion window
                    new ScoreFileDeletion();
                    
                } else {
                    JOptionPane.showMessageDialog(AdminLogin.this, "Invalid username or password.");
                }
            }
        });

        add(panel);
        setVisible(true);
    }
}


