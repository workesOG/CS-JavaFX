package com.workes;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class CircleController {
    @FXML
    private Circle circle;
    private double x;
    private double y;
    private double radius;

    @FXML
    public void initialize() {
        x = circle.getCenterX();
        y = circle.getCenterY();
        radius = circle.getRadius();
    }

    public void moveUp() {
        move(0, -3);
    }

    public void moveDown() {
        move(0, 3);
    }

    public void moveRight() {
        move(3, 0);
    }

    public void moveLeft() {
        move(-3, 0);
    }

    public void increaseSize() {
        changeSize(5);
    }

    public void decreaseSize() {
        changeSize(-5);
    }

    private void move(double dx, double dy) {
        circle.setCenterX(x += dx);
        circle.setCenterY(y += dy);
    }

    private void changeSize(double dr) {
        circle.setRadius(radius += dr);
    }
}
