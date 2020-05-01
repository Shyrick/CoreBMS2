package Lesson5_1.L51_Practice.Symetria;


import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Map {

    Point pointA;
    Point pointB;
    Point pointC;
    Point startPoint;
    Point constStartPoint;



    public void showStartPoint (Pane root){
       this.pointA.showPoint(root, pointA);
        this.pointB.showPoint(root, pointB);
        this.pointC.showPoint(root, pointC);
        this.startPoint.showPoint(root, startPoint);
    }
    public Point getPointOnLine(Point p1, Point p2){

        double newX = p1.getX() + (p2.getX() - p1.getX())*0.6;
        double newY = p1.getY() + (p2.getY() - p1.getY())*0.6;
        return new Point(newX, newY);
    }

    public Point showPointOnLine (Pane root, Point p1, Point p2){
        Point newPoint =  getPointOnLine(p1, p2);
        Circle c1 = new Circle(newPoint.getX(), newPoint.getY(), 1);
        root.getChildren().addAll(c1);
        return  newPoint;
    }


    public Map(Point pointA, Point pointB, Point pointC, Point startPoint) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.startPoint = startPoint;
        this.constStartPoint = startPoint;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

}
