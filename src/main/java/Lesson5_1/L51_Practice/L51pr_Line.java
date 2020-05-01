package Lesson5_1.L51_Practice;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class L51pr_Line {

    L51pr1_Point p1;
    L51pr1_Point p2;
    Line lineFx;


    public double calcLength(){
      double length = getP1().calculateLength(getP2());
      return length;
    }
    public L51pr1_Point getPointOnLine(float percent){
    //    double length = calcLength(); это не нужно
    // Ссылка на математическое решение (ответ 5 )
    //   https://ru.stackoverflow.com/questions/499716/%d0%9a%d0%b0%d0%ba-%d0%bd%d0%b0%d0%b9%d1%82%d0%b8-%d1%82%d0%be%d1%87%d0%ba%d1%83-%d0%bd%d0%b0-%d0%be%d1%82%d1%80%d0%b5%d0%b7%d0%ba%d0%b5
        double newX = getP1().getX() + (getP2().getX() - getP1().getX())*percent;
        double newY = getP1().getY() + (getP2().getY() - getP1().getY())*percent;
        return new L51pr1_Point(newX, newY);
    }

    public void drawLine (Pane root){
//        root.getChildren().clear();
       root.getChildren().addAll(getLineFx());
    }

    public void clearLine (Pane root){
        root.getChildren().clear();
    }

    public void showPointOnLine (Pane root,  float percent){
       L51pr1_Point p =  getPointOnLine(percent);
        Circle c1 = new Circle(p.getX(), p.getY(), 5);
        root.getChildren().addAll(c1);
    }



    public L51pr_Line(L51pr1_Point p1, L51pr1_Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.lineFx = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public void setP1(L51pr1_Point p1) {
        this.p1 = p1;
    }

    public void setP2(L51pr1_Point p2) {
        this.p2 = p2;
    }

    public void setLineFx(Line lineFx) {
        this.lineFx = lineFx;
    }

    public L51pr1_Point getP1() {
        return p1;
    }

    public L51pr1_Point getP2() {
        return p2;
    }

    public Line getLineFx() {
        return lineFx;
    }
}
