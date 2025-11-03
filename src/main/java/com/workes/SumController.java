package com.workes;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

// Unummereret JavaFX øvelse 03/11/2025
public class SumController {
    @FXML
    private TextField leftInput;
    @FXML
    private TextField rightInput;
    @FXML
    private Label sumLabel;

    @FXML
    public void initialize() {
        sumLabel.setText("0");
    }

    public void calculateSum() {
        if (leftInput.getText().isEmpty() && rightInput.getText().isEmpty()) {
            sumLabel.setText("I'd like some numbers, please :)");
            return;
        } else if (leftInput.getText().isEmpty()) {
            leftInput.setText("0");
        } else if (rightInput.getText().isEmpty()) {
            rightInput.setText("0");
        }
        int left = Integer.parseInt(leftInput.getText());
        int right = Integer.parseInt(rightInput.getText());
        int sum = left + right;
        sumLabel.setText(String.valueOf(sum));
    }

    // Valider input istedet for fejlmeddelelser
    public void validateLeftInput() {
        String text = leftInput.getText();
        String digitsOnly = text.replaceAll("[^0-9]", "");
        while (digitsOnly.length() > 0 && digitsOnly.charAt(0) == '0') {
            digitsOnly = digitsOnly.substring(1);
        }
        if (!digitsOnly.equals(text)) {
            leftInput.setText(digitsOnly);
            leftInput.positionCaret(leftInput.getText().length());
        }
    }
    
    public void validateRightInput() {
		String text = rightInput.getText();
		String digitsOnly = text.replaceAll("[^0-9]", "");
        while (digitsOnly.length() > 0 && digitsOnly.charAt(0) == '0') {
            digitsOnly = digitsOnly.substring(1);
        }
        if (!digitsOnly.equals(text)) {
            rightInput.setText(digitsOnly);
            rightInput.positionCaret(rightInput.getText().length());
        }
    }
}
