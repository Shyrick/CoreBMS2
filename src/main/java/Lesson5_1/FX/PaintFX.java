package Lesson5_1.FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class PaintFX extends Application {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGTH = 700;
    private static final int RGB_SYMBOLS_COUNT = 6;
    private static final int COUNT_OF_CIRCLES = 100;

    private Random r = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.setHeight(WINDOW_HEIGTH);
        primaryStage.setMaxWidth(WINDOW_WIDTH);
        primaryStage.setMaxHeight(WINDOW_HEIGTH);
        primaryStage.setMinWidth(WINDOW_WIDTH);
        primaryStage.setMinHeight(WINDOW_HEIGTH);
    }

    void drawUI (Pane root, Pane circlesRoot){
        Button button = new Button("Regenerate");
        button.setTranslateX(10);
        button.setTranslateY(10);
        button.setOnAction(event -> {
        //  root.getChildren().clear();    //Но кнопка находится в root, пожтому она тоже удалиться
                         // Поэтому вложим в root еще одну область circlesRoot для рисоания кругов,
                        // а кнопку оставим в самой root и очищать будем только вложенную область
            circlesRoot.getChildren().clear();
            draw(circlesRoot);

        });
        root.getChildren().addAll(button);
    }

    private Paint generateRandomColor (){
        String rgb = "#" ;

        for (int i = 0; i < RGB_SYMBOLS_COUNT ; i++) {
            rgb += (char)('0' + r.nextInt(9)); // если к символу прибавить число, то изменится сам символ
                                                        // и превратиться в int, поэтому делаем приведение к типу char
        }
        return Paint.valueOf(rgb);
    }

    private Circle generateCircle (int maxRadius, int maxStroke){
        Circle c = new Circle(r.nextDouble() * WINDOW_WIDTH,
                r.nextDouble() * WINDOW_HEIGTH,
                r.nextDouble()*maxRadius);

        c.setStrokeWidth(r.nextDouble()* maxStroke);
        c.setStroke(generateRandomColor());
        c.setFill(Paint.valueOf("#00000000"));//Задаем прозначность заполнения (полностью прозрачная внутренность)
        return c;
    }
    private void draw (Pane root){
//        Circle c1 = new Circle(250, 250,100); // Создаем круг
//        // c1.setFill(Paint.valueOf("#AABBCC")); //Задаем цвет кругу (цвет в формате RGB)
//        c1.setStroke(Paint.valueOf("#334455"));
//        c1.setStrokeWidth(10);
        for (int i = 0; i < COUNT_OF_CIRCLES ; i++) {
            Circle circle = generateCircle (100, 10);
            root.getChildren().addAll(circle);
        }


    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Pane circlesRoot = new Pane();
        root.getChildren().addAll(circlesRoot);

        drawUI (root, circlesRoot);
        draw(circlesRoot);
        windowSetup(primaryStage);

        primaryStage.setScene(new Scene(root));
        primaryStage.setMaxWidth(WINDOW_WIDTH);
        primaryStage.setMaxHeight(WINDOW_HEIGTH);
        primaryStage.show();
    }



}
