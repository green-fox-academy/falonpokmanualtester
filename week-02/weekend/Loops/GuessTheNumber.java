package Loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
         /* Írj egy programot ami tárol egy számot és
         a felhasználónak kell kitalálnia azt.
         A felhasználó találgathat és
         minden standard input-ba beírt szám után
         a programnak ki kell írnia egyet ezek közül:

         A tárolt szám nagyobb
         A tárolt szám kisebb
         Eltaláltad a számot
        */

        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int trials = 10;
        int i, userInput;
        System.out.println("Találd ki, melyik számra gondoltam!");
        System.out.println("10 próbálkozásod van. ");

        for (i = 0; i < trials; i++) {
            System.out.println("Írj be egy számot 1 és 100 között! ");

            userInput = scanner.nextInt();

            if (number == userInput) {
                System.out.println("Eltaláltad a számot");
                break;
            } else if (number > userInput && i != trials - 1) {
                System.out.println("A tárolt szám nagyobb, mint " + userInput);
            }
            if (number < userInput && i != trials - 1) {
                System.out.println("A tárolt szám kisebb, mint " + userInput);
            }
        }
        if (i == trials) {
            System.out.println("Nincs több próbálkozás. A tárolt szám: " + number);
        }
    }
}


