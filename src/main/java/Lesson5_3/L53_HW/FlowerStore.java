package Lesson5_3.L53_HW;

import Lesson5_3.L53_HW.Flawers.Daisy;
import Lesson5_3.L53_HW.Flawers.Flower;
import Lesson5_3.L53_HW.Flawers.Rose;
import Lesson5_3.L53_HW.Flawers.Tulip;

public class FlowerStore {

    public int money = 0;

    public void showBuket (Flower [] buket){
        for (int i = 0; i < buket.length ; i++) {
            if (i < (buket.length -1)) {
                System.out.print(buket[i].toString() + " ");
            }   if (i == (buket.length -1)){
                    System.out.print(buket[i].toString() + "\n ");
            }
        }
    }

    public void sell (int roseNumber, int daisyNumber, int tulipNumber){
        Flower [] buket = new Flower[roseNumber + daisyNumber + tulipNumber];
        for (int i = 0; i < roseNumber ; i++) {
            buket [i] =  new Rose();
            money += buket [i].getPrice();
        }
        for (int i = roseNumber; i < (roseNumber + daisyNumber) ; i++) {
            buket [i] =  new Daisy();
            money += buket [i].getPrice();
        }
        for (int i = (roseNumber + daisyNumber); i < buket.length ; i++) {
            buket [i] =  new Tulip();
            money += buket [i].getPrice();
        }
        showBuket (buket);
        System.out.println("money = " + money);
    }

    public void sellSequence (int roseNumber, int daisyNumber, int tulipNumber) {
        Flower[] buket = new Flower[roseNumber + daisyNumber + tulipNumber];
        int i = 0;
        while (i < buket.length) {
            if (roseNumber > 0) {
                buket[i] = new Rose();
                money += buket [i].getPrice();
                roseNumber--;
                i++;
            }
            if (daisyNumber > 0) {
                buket[i] = new Daisy();
                money += buket [i].getPrice();
                daisyNumber--;
                i++;
            }
            if (tulipNumber > 0) {
                buket[i] = new Tulip();
                money += buket [i].getPrice();
                tulipNumber--;
                i++;
            }
        }
        showBuket (buket);
        System.out.println("money = " + money);
    }
}
