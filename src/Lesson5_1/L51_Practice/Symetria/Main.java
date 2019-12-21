package Lesson5_1.L51_Practice.Symetria;

import Lesson5_1.L51_Practice.L51pr_Window;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Window window = new Window();
        Pane root = new Pane();
        Pane frontRoot = new Pane();
        root.getChildren().addAll(frontRoot);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);
        primaryStage.show();


        Point p1 = new Point(450, 70);
        Point p2 = new Point(50, 620);
        Point p3= new Point(750, 620);
        Point startPoint = new Point(500, 300);
        Map map = new Map(p1, p2, p3, startPoint);
        Controller controller = new Controller(map);

        controller.uiSetup(root, frontRoot);
        controller.map.showStartPoint(root);
//        controller.doPainting(frontRoot, p1, p2, p3, startPoint);

    }
}
