package Lesson5_1.L51_Practice.Symetria;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Window {
    private static final int WIDTH = 900;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 900;
    private static final int MAX_HEIGTH = 700;
    private static final int MIN_WIDTH = 400;
    private static final int MIN_HEIGTH = 400;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("Symetria");
    }


}
