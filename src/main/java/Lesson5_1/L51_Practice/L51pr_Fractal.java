package Lesson5_1.L51_Practice;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class L51pr_Fractal {

    int depht;
    float percentOffset;
    String fieldOfDepth = "";
    String fieldOfPersent = "";



    public void draw(Pane root, L51pr_Triangle triangle){

        triangle.drawTriangle(root);
        if (depht >0) {
            L51pr_Triangle newTriangle = new L51pr_Triangle(triangle.getL1().getPointOnLine(percentOffset),
                    triangle.getL2().getPointOnLine(percentOffset),
                    triangle.getL3().getPointOnLine(percentOffset));
            depht --;
            draw(root, newTriangle);
        }
    }

    public void draw (){
// Непонятно, как метод может рисовать, если он не принимает root.
// На чем он тогда должен рисовать??
    }



    public L51pr_Fractal(int depht, float percentOffset) {
        this.depht = depht;
        this.percentOffset = percentOffset;
    }

    public int getDepht() {
        return depht;
    }

    public float getPercentOffset() {
        return percentOffset;
    }

    public void setDepht(int depht) {
        this.depht = depht;
    }

    public void setPercentOffset(float percentOffset) {
        this.percentOffset = percentOffset;
    }
}
