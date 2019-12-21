package MNRG;

import java.util.Random;

public class Dice {

    int dice1;
    int dice2;


    int dropDice (){
        Random random = new Random();
        int r = random.nextInt(7);
        while (r == 0)
            r = random.nextInt(7);
        return r;
    }


    public Dice() {
        this.dice1 = dropDice();
        this.dice2 = dropDice();
    }
}
