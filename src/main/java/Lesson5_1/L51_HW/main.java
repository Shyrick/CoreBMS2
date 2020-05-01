package Lesson5_1.L51_HW;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Window window = new Window(primaryStage);
        Pane root = new Pane();
        Pane frontRoot = new Pane();
        root.getChildren().addAll(frontRoot);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);
        primaryStage.show();

        SnowManPainter snowManPainter = new SnowManPainter(primaryStage);
        window.textAndTextFields(root);
        window.buttons(root, frontRoot);


    }
}
