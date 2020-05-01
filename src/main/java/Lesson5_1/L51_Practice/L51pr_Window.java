package Lesson5_1.L51_Practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class L51pr_Window {

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 800;
    private static final int MAX_HEIGTH = 700;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("L51_Practice");
        primaryStage.titleProperty();
    }

    void uISetup ( Pane root ){
        Text text = new Text();
        text.setTranslateX(10);
        text.setTranslateY(20);
        text.setText("MyText");
        Font font = new Font(14);
        text.setFont(font);

        root.getChildren().addAll(text);
    }

    public void FractalWindowSetup ( Pane root, Pane fractalRoot, L51pr_Triangle triangle ){
        Text text1 = new Text("Глубина фрактала");
        text1.setTranslateX(30);
        text1.setTranslateY(20);

        Text text2 = new Text("Отступ в %");
        text2.setTranslateX(230);
        text2.setTranslateY(20);

        TextField textField1 = new TextField();
        textField1.setTranslateX(20);
        textField1.setTranslateY(30);


        TextField textField2 = new TextField();
        textField2.setTranslateX(200);
        textField2.setTranslateY(30);


        Button button1 = new Button("Рисовать");
        button1.setTranslateX(400);
        button1.setTranslateY(30);
        button1.setOnAction(event -> {
            int depht = Integer.valueOf(textField1.getText());
           float percentOffset = (float)((Integer.valueOf(textField2.getText()))/100.0f);

//            System.out.println(percentOffset + " / " + depht);
            L51pr_Fractal fractal = new L51pr_Fractal(depht, percentOffset);
            fractal.draw(fractalRoot, triangle );
        });

        Button button2 = new Button("Очистить");
        button2.setTranslateX(500);
        button2.setTranslateY(30);
        button2.setOnAction(event -> {
            fractalRoot.getChildren().clear();
        });



        root.getChildren().addAll(text1, text2, textField1, textField2, button1, button2);

    }






}
