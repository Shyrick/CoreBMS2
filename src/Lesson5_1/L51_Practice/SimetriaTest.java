package Lesson5_1.L51_Practice;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Collection;
import java.util.Random;

public class SimetriaTest extends Application {

    public static final int NUMBER_OF_POINTS = 100000;
    L51pr1_Point [] points = new L51pr1_Point[1000];
    public static void main(String[] args) {
        launch(args);


    }

    int random (){
        Random random = new Random();
        int r = random.nextInt(7);
        while (r == 0)
            r = random.nextInt(7);
        return r;
    }

    L51pr1_Point choosePointDirection (L51pr1_Point p1, L51pr1_Point p2, L51pr1_Point p3){
        if (random() == 1 || random() == 2)            return p1;
        else  if (random() == 3 || random() == 4)            return p2;
        else return p3;
    }

    public L51pr1_Point showPointOnLine (Pane root, L51pr1_Point p1, L51pr1_Point p2){
        L51pr_Line line = new L51pr_Line(p1, p2);
        L51pr1_Point newPoint =  line.getPointOnLine(0.5f);
        Circle c1 = new Circle(newPoint.getX(), newPoint.getY(), 1);
        root.getChildren().addAll(c1);
        return newPoint;
    }
    void doPainting (Pane root, L51pr1_Point p1, L51pr1_Point p2, L51pr1_Point p3, L51pr1_Point startpoint){
        L51pr1_Point newPoint = startpoint;
        for (int i = 0; i < NUMBER_OF_POINTS ; i++) {
           newPoint =  showPointOnLine (root, choosePointDirection(p1, p2, p3), newPoint);

        }

    }



    void drawPoint (Circle circle, Pane root){

        root.getChildren().addAll(circle);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        L51pr_Window window = new L51pr_Window();
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);
        primaryStage.show();

        L51pr1_Point p1 = new L51pr1_Point(400, 50);
        L51pr1_Point p2 = new L51pr1_Point(700, 600);
        L51pr1_Point p3 = new L51pr1_Point(50, 600);
        L51pr1_Point p4 = new L51pr1_Point(200, 200);
        Circle c1 = new Circle(p1.getX(), p1.getY(),1);
        Circle c2 = new Circle(p2.getX(), p2.getY(),1);
        Circle c3 = new Circle(p3.getX(), p3.getY(),1);
        Circle c4 = new Circle(p4.getX(), p4.getY(),1);
        drawPoint(c1, root);
        drawPoint(c2, root);
        drawPoint(c3, root);
        drawPoint(c4, root);
        doPainting(root, p1, p2, p3, p4 );





    }
}
