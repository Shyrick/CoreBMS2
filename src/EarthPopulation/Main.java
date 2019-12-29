package EarthPopulation;

public class Main {

    static long firstGeneration = 6;
    static int firstChildAge = 25;
    static int numberOfChildreninFamaly = 3;
    static int deathAge = 75;
    static long population;




    void ageOfPopulation () {
        population = firstGeneration;
        long numberOfFamalys = population / 2  ;
        int ageOfPopulation = 0;

        long secondGeneration = firstGeneration + numberOfFamalys*numberOfChildreninFamaly;
        long thirdGeneration =  secondGeneration + numberOfFamalys*numberOfChildreninFamaly;
        while (population < 7000000000L){
                if (ageOfPopulation % firstChildAge == 0){
                    secondGeneration = firstGeneration + numberOfChildreninFamaly;


                }
            if (ageOfPopulation % deathAge == 0){
                population -= firstGeneration;
                firstGeneration = secondGeneration;
                secondGeneration = thirdGeneration;
            }
            population = firstGeneration + secondGeneration + thirdGeneration;
        }

    }

    public static void main(String[] args) {

    }

}
