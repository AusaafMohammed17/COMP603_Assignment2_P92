/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.memorygame2;

/**
 *
 * @author ausup
 */

public class MemoryGame2 {

    private static String playerName;

    public static void main(String[] args) {
        GameMenu menu = new GameMenu();
        GameInstructions instructions = new GameInstructions();
        StartGame startGame = new StartGame(playerName);
        
        menu.setVisible(true);
        instructions.setVisible(false);

    }

}

