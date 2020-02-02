package Lesson5_3.L53_HW;

import Lesson5_3.L53_HW.Flawers.Daisy;
import Lesson5_3.L53_HW.Flawers.Flower;
import Lesson5_3.L53_HW.Flawers.Rose;
import Lesson5_3.L53_HW.Flawers.Tulip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class FlowersLoader {
//    String path = "files/Lesson5_3/L53_HW/Flowers.txt";


    public static Flower[] load (String path) throws FileNotFoundException {

        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);
        scanner.next();
        int roseNumber = scanner.nextInt();
        Rose [] roses = new Rose[roseNumber];
        for (int i = 0; i < roseNumber ; i++) {
            roses [i] = new Rose();
        }
        scanner.next();
        int daisyNumber = scanner.nextInt();
        Daisy [] daisies = new Daisy[daisyNumber];
        for (int i = 0; i < daisyNumber ; i++) {
            daisies [i] = new Daisy();
        }
        scanner.next();
        int tulipNumber = scanner.nextInt();
        Tulip [] tulips = new Tulip[tulipNumber];
        for (int i = 0; i < tulipNumber ; i++) {
            tulips [i] = new Tulip();
        }
        Flower[] flowers = new Flower[roseNumber + daisyNumber + tulipNumber];

        for (int i = 0; i < flowers.length; i++) {
            if (i < roseNumber){
                flowers [i] = roses [i];
            }
            if (i >= roseNumber && i < (roseNumber + daisyNumber) ){
                flowers[i] = daisies [i-roseNumber];
            }
            if (i >= (roseNumber + daisyNumber)){
                flowers [i] = tulips [i - (roseNumber + daisyNumber)];
            }
//            System.out.println(i + " " + flowers [i]); - для проверки работы метода
        }
        return flowers;
    }
}
