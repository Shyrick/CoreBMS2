package Lesson5_1.L51_HW;

import Lesson5_1.L51_Practice.L51pr_Fractal;
import Lesson5_1.L51_Practice.L51pr_Triangle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Window extends SnowManPainter {

    TextField textField1;
    TextField textField2;
    TextField textField3;
    Text text4;

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 800;
    private static final int MAX_HEIGTH = 700;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    public Window(Stage primaryStage) {
        super(primaryStage);
    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("SnowManPainter");
        primaryStage.titleProperty();
    }

    public void textAndTextFields (Pane root ){
        Text text1 = new Text("Количество кругов");
        text1.setTranslateX(40);
        text1.setTranslateY(20);

        textField1 = new TextField();
        textField1.setTranslateX(40);
        textField1.setTranslateY(30);

        Text text2 = new Text("Минимальный радиус");
        text2.setTranslateX(200);
        text2.setTranslateY(20);

        textField2 = new TextField();
        textField2.setTranslateX(200);
        textField2.setTranslateY(30);

        Text text3 = new Text("Максимальный радиус");
        text3.setTranslateX(370);
        text3.setTranslateY(20);

        textField3 = new TextField();
        textField3.setTranslateX(360);
        textField3.setTranslateY(30);

        text4 = new Text("Максимальный радиус слишком большой");
        text4.setTranslateX(370);
        text4.setTranslateY(70);

        root.getChildren().addAll(text1, text2, text3, textField1, textField2, textField3);
    }

    public void buttons (Pane root, Pane frontRoot ){

        Button button1 = new Button("Рисовать");
        button1.setTranslateX(570);
        button1.setTranslateY(30);
        button1.setOnAction(event -> {
            numberOfCirles = Integer.valueOf(textField1.getText());
            minRadius = Double.valueOf(textField2.getText());
            maxRadius = Double.valueOf(textField3.getText());

            if(maxRadius > ((primaryStage.getHeight())/(1.8*numberOfCirles))){
                frontRoot.getChildren().clear();
                frontRoot.getChildren().addAll(text4);
            }else {
                frontRoot.getChildren().clear();
                drawBody(frontRoot, numberOfCirles);
            }
        });

        Button button2 = new Button("Очистить");
        button2.setTranslateX(660);
        button2.setTranslateY(30);
        button2.setOnAction(event -> {
            frontRoot.getChildren().clear();
        });

        root.getChildren().addAll(button1, button2);

    }








}
