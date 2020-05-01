package MNRG;

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
        Pane root = new Pane();
        Pane mapRoot = new Pane();
        root.getChildren().addAll(mapRoot);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Map map = new Map();
        map.windowSetup(primaryStage);
        primaryStage.show();

        Dice dice = new Dice();
//        map.showDice(root, "2","2");
        Player player1 = new Player("Ale");
        Player player2 = new Player("Den");
        Player [] players = {player1, player2};

        MoveController mc = new MoveController(players, dice, map );
        mc.makeActivPlayer(players);
        mc.button(root, mapRoot);
//        map.showDice2(root, dice.dice1, dice.dice2);


    }
}
