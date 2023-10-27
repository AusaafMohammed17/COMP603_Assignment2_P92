/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausup
 */

import javax.swing.JOptionPane;

public class QuitGame {
    public QuitGame() {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Quit Game", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0); // Terminate the game
        }
    }
}
