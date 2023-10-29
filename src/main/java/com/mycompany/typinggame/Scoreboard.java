/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typinggame;

/**
 *
 * @author ausaafmohammed
 */

import java.io.*;
import java.util.ArrayList;

public class Scoreboard {
    private ArrayList<ScoreboardEntry> entries;
    private String dataFilePath;

    // Test cases
    public Scoreboard(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        entries = new ArrayList<>();
        loadData(); // Load data from the file when creating the scoreboard
    }

    public void addEntry(ScoreboardEntry entry) {
        entries.add(entry);
        saveData(); // Save data to the file after adding an entry
    }

    public ArrayList<ScoreboardEntry> getEntries() {
        return entries;
    }

    private void saveData() {
        // create new object and save the entries to the data file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFilePath))) {
            oos.writeObject(entries); // Serialize and write the 'entries' ArrayList to the data file
        } catch (IOException e) {
            e.printStackTrace(); // Handle any IOException by printing the stack trace for debugging
        }
    }

    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFilePath))) {
            // Deserialize and load the entries from the data file
            entries = (ArrayList<ScoreboardEntry>) ois.readObject(); // Read and cast the object to 'entries'
        } catch (IOException | ClassNotFoundException e) {
            entries = new ArrayList<>(); // Initialize with an empty list if data cannot be loaded
        }
    }

}
