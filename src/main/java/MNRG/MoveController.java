package MNRG;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MoveController {
    Player [] players = new Player[2];
    Dice dice;
    Map map;


    void makeActivPlayer (Player [] players){
        players [0].isActiv = true;
    }

    void changeActivePlayer (){
        for (int i = 0; i < players.length ; i++) {
            if (players[i].isActiv == true){
                players[i].isActiv = false;
                if (i+1 < players.length){
                    players[i+1].isActiv = true;
                    break;
                }else players[0].isActiv = true;
                break;
            }
        }
    }

    public Player findActiveplayer (){
        Player activPlayer = null;
        for (int i = 0; i < players.length; i++) {
            if (players [i].isActiv == true ){
                activPlayer = players [i];
               break;
            }
        }
        return activPlayer;
    }


    void makeMove (Pane mapRoot, int dice1, int dice2){
       Player activPlayer = findActiveplayer();
        activPlayer.totalScore += dice1+dice2;
       int currentPosition = activPlayer.position;
       if (currentPosition + (dice1 + dice2) > 40){
           activPlayer.circleCount++;

           activPlayer.position = currentPosition + dice1 + dice2 - 40;
           } else activPlayer.position = currentPosition += (dice1+dice2);

       map.showPlayers(mapRoot, players);
       if (dice1 != dice2) {
            changeActivePlayer();
       }
    }

    void button (Pane root, Pane mapRoot){
        Font font = new Font(20);

        Text text1 = new Text("-");
        text1.setTranslateX(20);
        text1.setTranslateY(30);
        text1.setFont(font);

        Text text2 = new Text("-");
        text2.setTranslateX(35);
        text2.setTranslateY(30);
        text2.setFont(font);

        Button button1 = new Button("Бросать");
        button1.setTranslateX(60);
        button1.setTranslateY(10);
        button1.setOnAction(event -> {
            int d1 = dice.dropDice();
            int d2 = dice.dropDice();
            text1.setText(Integer.toString(d1));
            text2.setText(Integer.toString(d2));
            makeMove( mapRoot, d1, d2);
        });

        root.getChildren().addAll(button1);
        root.getChildren().addAll(text1, text2);
    }

    public MoveController(Player[] players, Dice dice, Map map) {
        this.players = players;
        this.dice = dice;
        this.map = map;
    }
}
