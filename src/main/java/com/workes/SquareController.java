package com.workes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

// Øvelse 2.a + 2.b 27/10/2025
public class SquareController {
    @FXML
    private Rectangle leftSquare;
    @FXML
    private Rectangle rightSquare;
    @FXML
    private Label collisionLabel;
    
    public void moveLeftSquareLeft() {
        moveSquare(leftSquare, -10, 0);
    }

    public void moveLeftSquareRight() {
        moveSquare(leftSquare, 10, 0);
    }

    public void moveRightSquareLeft() {
        moveSquare(rightSquare, -10, 0);
    }

    public void moveRightSquareRight() {
        moveSquare(rightSquare, 10, 0);
    }
    
    private void moveSquare(Rectangle square, double dx, double dy) {
        square.setLayoutX(square.getLayoutX() + dx);
        square.setLayoutY(square.getLayoutY() + dy);
        double collision = getCollisionOffset();
        if (collision > 0) {
            square.setLayoutX(square.getLayoutX() - (collision * dx / 10));
            collisionLabel.setText("Collision!");
        } else {
            collisionLabel.setText("");
        }
    }

    private double getCollisionOffset() {
        double leftSquareRightSideX = leftSquare.getLayoutX() + leftSquare.getWidth();
        double rightSquareLeftSideX = rightSquare.getLayoutX();

        if (leftSquareRightSideX >= rightSquareLeftSideX) {
            return leftSquareRightSideX - rightSquareLeftSideX;
        }
        return 0;
    }
}
