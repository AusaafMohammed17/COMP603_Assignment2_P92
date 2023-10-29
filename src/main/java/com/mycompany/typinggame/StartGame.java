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
import java.util.ArrayList;
import java.util.Random;

public class StartGame {

    private JFrame frame;
    private JPanel panel;
    private JLabel questionLabel;
    private JTextField answerField;
    private JButton submitButton;
    private String playerName;

    private Random random;
    private int currentQuestionIndex;
    private ArrayList<String> numbers;
    private javax.swing.Timer timer;
    private int score; // Added to keep track of the score
    private boolean scoreDisplayed; // Flag to check if the score has been displayed
    private String expectedAnswer; // Added to store the expected answer for testing

    public StartGame(String playerName) {
        this.playerName = playerName;
        random = new Random();
        currentQuestionIndex = 0;
        numbers = new ArrayList<>();
        score = 0; // Initialize score to 0
        scoreDisplayed = false; // Initialize the flag to false
        expectedAnswer = null; // Initialize expectedAnswer to null

        // Creating new objects
        frame = new JFrame("Memory Quiz");
        panel = new JPanel();
        questionLabel = new JLabel();
        answerField = new JTextField();
        submitButton = new JButton("Submit");

        // Set the size of the text fields, answer dialog box, and submit button.
        answerField.setPreferredSize(new Dimension(200, 50));
        submitButton.setPreferredSize(new Dimension(100, 50));
        questionLabel.setPreferredSize(new Dimension(100, 20));

        // Set the font of the questionLabel and answerField components.
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        answerField.setFont(new Font("Arial", Font.PLAIN, 24));

        // Set the layout manager of the panel to the FlowLayout object.
        panel.setLayout(new FlowLayout());

        // Add the components to the panel in the desired order.
        panel.add(questionLabel);
        panel.add(answerField);
        panel.add(submitButton);

        // Add the panel to the frame.
        frame.add(panel, BorderLayout.CENTER);

        // Handle pressing Enter in the answer field as a submit action
        answerField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButton.doClick(); // Simulate a click on the submit button
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Handle the window-closing event
                showScore();
                frame.dispose(); // Close the game window
            }
        });

        // Create a timer with a 1.5-second delay (1500 milliseconds)
        // I chose time to be 1.5 seconds because it is a perfect amount for a typing game delay
        timer = new javax.swing.Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                questionLabel.setVisible(false);
                answerField.setText("");
                currentQuestionIndex++;
                showNextQuestion();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = answerField.getText();
                boolean isCorrect = answer.equals(getCorrectAnswer());

                if (isCorrect) {
                    questionLabel.setText("Correct!");
                    score++; // Increment the score for correct answers
                } else {
                    questionLabel.setText("Wrong!");
                }

                // Start the timer.
                timer.start();

                if (currentQuestionIndex >= numbers.size()) {
                    // Display the score when all questions have been answered
                    showScore();
                    frame.setVisible(false);
                }
            }
        });

        frame.setSize(1000, 800);
        frame.setVisible(true);
        generateDigits(); // Generate the sequence of numbers
        showNextQuestion(); // Display the first question
    }

    private void generateDigits() {
        // Generate a random sequence of 5 numbers.
        for (int i = 0; i < 10; i++) {
            numbers.add(String.valueOf(random.nextInt(10)));
        }
    }

    private void showNextQuestion() {
        if (currentQuestionIndex < numbers.size()) {
            questionLabel.setText(numbers.get(currentQuestionIndex));
            questionLabel.setVisible(true);

            // Start the timer here
            timer.start();
        } else {
            // Display the score when all questions have been answered
            showScore();
            frame.setVisible(false);
        }
    }

    private String getCorrectAnswer() {
        if (currentQuestionIndex >= numbers.size()) {
            return null;
        }
        return numbers.get(currentQuestionIndex);
    }

    private void showScore() {
        if (!scoreDisplayed) {
            new ScoreDisplay(playerName, score).setVisible(true);
            scoreDisplayed = true;
            frame.setVisible(false); // Hide the StartGame window
        }
    }
    
    // Set the expected answer for testing
    public void setAnswer(String expectedAnswer) {
        this.expectedAnswer = expectedAnswer;
    }

    // Get the current score
    public int getScore() {
        return score;
    }
    
    public void submitAnswer(String answer) {
        String correctAnswer = getCorrectAnswer();
        if (answer.equals(correctAnswer)) {
            questionLabel.setText("Correct!");
            score++; // Increment the score for correct answers
        } else {
            questionLabel.setText("Wrong!");
        }

        // Start the timer.
        timer.start();

        if (currentQuestionIndex >= numbers.size()) {
            // Display the score when all questions have been answered
            showScore();
            frame.setVisible(false);
        }
    }
}
