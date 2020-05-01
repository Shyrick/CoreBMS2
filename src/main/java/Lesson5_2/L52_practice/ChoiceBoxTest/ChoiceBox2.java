package Lesson5_2.L52_practice.ChoiceBoxTest;

import javafx.application.Application;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;

public class ChoiceBox2 extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        String [] arr = {"Java", "JavaScript", "C#", "Python"};
        ObservableList<String> langs = FXCollections.observableArrayList(arr);
//        ObservableList<String> langs2 = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        // работает так же как и с ранее созданным массивом

        ChoiceBox<String> langsChoiceBox = new ChoiceBox<String>(langs);
        langsChoiceBox.setValue("Java"); // значение по умолчанию
        langsChoiceBox.setTooltip(new Tooltip("Select the language")); // выпадающее окно при наведении

        Label lbl = new Label();
        // реакция на выбор
        langsChoiceBox.setOnAction(event -> lbl.setText(langsChoiceBox.getValue()));

        FlowPane root = new FlowPane(10, 10, langsChoiceBox, lbl);

        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("ChoiceBox in JavaFX");
        stage.show();
    }
}
