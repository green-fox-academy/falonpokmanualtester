package Functions;

import java.util.Scanner;

/* - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

 - Készíts egy függvényt `sum` névvel mely összeadja a számokat
   nullától a bemeneti paraméterig és visszaadja azok összegét.
*/
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot!");
        int userInput = scanner.nextInt();
        System.out.println("A számok összege nullától a beírt számig: " + sum(userInput));
    }

    public static int sum( int allnumbers) {
        int sumOfNumbers = 0;
        for (int i = 1; i <= allnumbers; i++) {
            sumOfNumbers += i;


    }
        return sumOfNumbers;
}
    }
