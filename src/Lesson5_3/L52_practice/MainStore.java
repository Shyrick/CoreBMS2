package Lesson5_3.L52_practice;

import Lesson5_3.L52_practice.Products.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainStore extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


//        Smartfone smartfone1 = new Smartfone(idCeeper.generateSmartfoneId(),"Nokia", 3, "Very good", 120);
        ProductRead readWriter = new ProductRead();
        Smartfone[] smartfones = readWriter.readSmartfonesFromFile();
        Vegetable [] vegetables = readWriter.readVegetablesFromFile();
        Water [] waters = readWriter.readWatersFromFile();

        Store store = new Store(1000, smartfones, vegetables, waters);
        IdCeeper idCeeper = new IdCeeper(store);
        WindowForms windowForms = new WindowForms(store);
        WindowStore windowStore = new WindowStore(idCeeper, store, windowForms);


        Pane root = new Pane();
        Pane frontRoot = new Pane();
        root.getChildren().addAll(frontRoot);

        Scene scene = new Scene(root, WIDTH, HEIGTH);
        primaryStage.setScene(scene);
        windowForms.windowSetup(primaryStage);
        primaryStage.show();

        windowStore.helloyMenu(frontRoot);

    }
}
