package Lesson5_1.L51_Practice;

import javafx.scene.layout.Pane;

public class L51pr_Triangle {

    L51pr_Line L1;
    L51pr_Line L2;
    L51pr_Line L3;

    public void drawTriangle(Pane root){
        root.getChildren().addAll( L1.getLineFx(),L2.getLineFx(), L3.getLineFx());
    }

    public void clearTriangle(Pane root){
        root.getChildren().clear();
    }

    public L51pr_Triangle (L51pr1_Point p1, L51pr1_Point p2, L51pr1_Point p3){
        this.L1 = new L51pr_Line(p1, p2);
        this.L2 = new L51pr_Line(p2, p3);
        this.L3 = new L51pr_Line(p3, p1);
    }

    public L51pr_Line getL1() {
        return L1;
    }

    public L51pr_Line getL2() {
        return L2;
    }

    public L51pr_Line getL3() {
        return L3;
    }

    public void setL1(L51pr_Line l1) {
        L1 = l1;
    }

    public void setL2(L51pr_Line l2) {
        L2 = l2;
    }

    public void setL3(L51pr_Line l3) {
        L3 = l3;
    }
}
