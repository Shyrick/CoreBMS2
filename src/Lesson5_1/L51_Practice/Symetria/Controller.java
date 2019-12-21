package Lesson5_1.L51_Practice.Symetria;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Random;

public class Controller {
    Map map;

    int random (){
        Random random = new Random();
        int r = random.nextInt(7);
        while (r == 0)
            r = random.nextInt(7);
        return r;
    }

    public Point choosePointDirection (Point p1, Point p2, Point p3){
        if (random() == 1 || random() == 2)            return p1;
        else  if (random() == 3 || random() == 4)            return p2;
        else return p3;
    }

    void doPainting (Pane root, Point p1, Point p2, Point p3, Point startpoint, int numberOrPoints){
//        Point newPoint = startpoint;
        for (int i = 0; i < numberOrPoints ; i++) {
            map.startPoint =  map.showPointOnLine (root, choosePointDirection(p1, p2, p3), map.startPoint);
        }

    }
    void uiSetup (Pane root, Pane frontRoot){
        Text text = new Text("Количество точек");
        text.setTranslateX(40);
        text.setTranslateY(30);

        TextField textField1 = new TextField();
        textField1.setTranslateX(200);
        textField1.setTranslateY(15);

        Button button1 = new Button("Рисовать");
        button1.setTranslateX(400);
        button1.setTranslateY(15);
        button1.setOnAction(event -> {
            int numberOrPoints = Integer.valueOf(textField1.getText());
            doPainting(frontRoot, map.pointA, map.pointB, map.pointC, map.startPoint, numberOrPoints);
        });

        Button button2 = new Button("Очистить");
        button2.setTranslateX(500);
        button2.setTranslateY(15);
        button2.setOnAction(event -> {
            map.startPoint = map.constStartPoint;
            frontRoot.getChildren().clear();
        });

        root.getChildren().addAll(text, textField1, button1, button2);
    }


    public Controller(Map map) {
        this.map = map;
    }


}
