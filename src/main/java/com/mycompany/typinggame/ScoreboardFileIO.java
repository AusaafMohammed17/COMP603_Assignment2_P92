/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausup
 */

import java.io.*;
import java.util.ArrayList;

public class ScoreboardFileIO {
    private String dataFilePath;

    public ScoreboardFileIO(String dataFilePath) {
        this.dataFilePath = dataFilePath;
    }

    public void writeData(ArrayList<ScoreboardEntry> entries) {
        // Implement code to write data to a file
    }

    public ArrayList<ScoreboardEntry> readData() {
        // Implement code to read data from a file
        return new ArrayList<>(); // Placeholder
    }
}
