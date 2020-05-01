package MNRG;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Map {

   Field field;
   int fieldNumber;
   Dice dice;



    private static final int WIDTH = 1200;
    private static final int HEIGTH = 800;
    private static final int MAX_WIDTH = 1300;
    private static final int MAX_HEIGTH = 850;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("MNGR");
    }

//    void showDice(Pane root, String dice1, String dice2){
//
//        Font font = new Font(20);
//
//        Text text1 = new Text(dice1);
//        text1.setTranslateX(20);
//        text1.setTranslateY(30);
//        text1.setFont(font);
//
//        Text text2 = new Text(dice2);
//        text2.setTranslateX(35);
//        text2.setTranslateY(30);
//        text2.setFont(font);
//
//        root.getChildren().addAll(text1, text2);
//    }

//    void  showPlayer (Pane mapRoot, Player player){
//        Text text1 = new Text(player.getName());
//        text1.setTranslateX(20);
//        text1.setTranslateY(100);
//
//        Text text2 = new Text(Integer.toString(player.getPosition()));
//        text2.setTranslateX(30);
//        text2.setTranslateY(150);
//        mapRoot.getChildren().clear();
//        mapRoot.getChildren().addAll(text1, text2);
//
//    }
    void  showPlayers (Pane mapRoot, Player [] players){
        Text text1 = new Text(players[0].getName());
        text1.setTranslateX(20);
        text1.setTranslateY(100);

        Text text2 = new Text(Integer.toString(players[0].getPosition()));
        text2.setTranslateX(30);
        text2.setTranslateY(150);

        Text text5 = new Text(Integer.toString(players[0].circleCount));
        text5.setTranslateX(20);
        text5.setTranslateY(200);

        Text text7 = new Text(Integer.toString(players[0].totalScore));
        text7.setTranslateX(20);
        text7.setTranslateY(230);

        Text text3 = new Text(players[1].getName());
        text3.setTranslateX(100);
        text3.setTranslateY(100);

        Text text4 = new Text(Integer.toString(players[1].getPosition()));
        text4.setTranslateX(100);
        text4.setTranslateY(150);

        Text text6 = new Text(Integer.toString(players[1].circleCount));
        text6.setTranslateX(100);
        text6.setTranslateY(200);

        Text text8 = new Text(Integer.toString(players[1].totalScore));
        text8.setTranslateX(100);
        text8.setTranslateY(230);

        mapRoot.getChildren().clear();
        mapRoot.getChildren().addAll(text1, text2, text3, text4, text5, text6, text7, text8);

    }


}
