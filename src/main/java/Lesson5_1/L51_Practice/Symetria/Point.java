package Lesson5_1.L51_Practice.Symetria;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Point {

    public double x;
    public double y;

    public void showPoint (Pane root, Point point){
         Circle c1 = new Circle(point.getX(), point.getY(), 2);
         root.getChildren().addAll(c1);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
