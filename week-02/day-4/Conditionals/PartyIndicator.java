package Conditionals;
import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írd be, hányan jönnek a buliba!");
        System.out.println("Lányok száma:");
        int userInput1 = scanner.nextInt();
        System.out.println("Fiúk száma:");
        int userInput2 = scanner.nextInt();
        int bulizok = (userInput1 + userInput2);

        boolean b1 = bulizok > 20 && userInput1 == userInput2;
        if  (b1) {
            System.out.println("Ez a buli kitűnő!");
        }
        boolean b2 = bulizok > 20 && userInput1 != userInput2;
        if  (b2) {
            System.out.println("Ez a buli egész jó!");
        }
        if (bulizok < 20) {
            System.out.println("Átlagos buli.");
        }

        if (userInput1 == 0) {
            System.out.println("Virsli parti.");
        }
        }

    }

        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party


