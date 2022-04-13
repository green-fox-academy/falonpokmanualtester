package Functions;

import java.util.Scanner;

/* - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

 - Készíts egy függvényt `factorio` névvel,
   mely visszaadja a bemeneti paraméter faktoriális értékét.
 */
public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int userInput = scanner.nextInt();
        System.out.println("A beírt szám faktoriálisa: " + factorio(userInput));
    }

    public static int factorio( int allnumbers) {
        int sumOfNumbers = allnumbers;
        for (int i = 1; i < allnumbers; i++) {
            sumOfNumbers *= i;


        }
        return sumOfNumbers;
    }
}
