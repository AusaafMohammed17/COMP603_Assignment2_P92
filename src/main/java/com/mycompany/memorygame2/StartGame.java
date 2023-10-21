/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memorygame2;
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
    private ArrayList<String> digits;
    private javax.swing.Timer timer;

    public StartGame(String playerName) {
        this.playerName = playerName; // Store the player's name

        random = new Random();
        currentQuestionIndex = 0;
        digits = new ArrayList<>();

        // Generate a random sequence of 10 digits.
        for (int i = 0; i < 5; i++) {
            digits.add(String.valueOf(random.nextInt(10)));
        }


        // Create the GUI components.
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
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        answerField.setFont(new Font("Arial", Font.PLAIN, 12));

        // Set the layout manager of the panel to the FlowLayout object.
        panel.setLayout(new FlowLayout());

        // Add the components to the panel in the desired order.
        panel.add(questionLabel);
        panel.add(answerField);
        panel.add(submitButton);

        // Add the panel to the frame.
        frame.add(panel, BorderLayout.CENTER);

        // Create a timer.
        timer = new javax.swing.Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hide the question
                questionLabel.setVisible(false);

                // Clear the answer field.
                answerField.setText("");

                // Display the next question.
                currentQuestionIndex++;
                String nextQuestion = getQuestion();

                // If there are no more questions, end the quiz.
                if (nextQuestion == null) {
                    frame.setVisible(false);
                    return;
                }

                // Display the next question to the user.
                questionLabel.setText(nextQuestion);
                questionLabel.setVisible(true);
            }
        });

        // Add an action listener to the submit button.
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = answerField.getText();
                boolean isCorrect = answer.equals(getCorrectAnswer());

                // Display the result to the user.
                if (isCorrect) {
                    questionLabel.setText("Correct!");
                } else {
                    questionLabel.setText("Incorrect. The correct answer is " + getCorrectAnswer());
                }

                // Start the timer.
                timer.start();
            }
        });

        // Set the window size to (1000, 800).
        frame.setSize(1000, 800);

        // Set the window visibility to true.
        frame.setVisible(true);

        // Start the timer.
        timer.start();
    }

    private String getQuestion() {
        if (currentQuestionIndex >= digits.size()) {
            return null;
        }

        return digits.get(currentQuestionIndex);
    }

    private String getCorrectAnswer() {
        if (currentQuestionIndex >= digits.size()) {
            return null;
        }

        return digits.get(currentQuestionIndex);
    }
}

