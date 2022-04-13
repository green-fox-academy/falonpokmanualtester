package Loops;
/*
 Írj egy programot, ami egy számot kér a standard input-ból.
 Amennyi az első szám értéke volt, annyiszor kell új számot kérnie.
 Ha megkapta az összes számot, printelje ki az összegét és
 az átlagát ezeknek a számoknak a következő formátumban:

 Összeg: 22, Átlag: 4.4
*/

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, userInput1;
        System.out.println("Írj be egy egész számot 1 és 10 között!");
        userInput1 = scanner.nextInt();
        System.out.println("Még " + userInput1 + "számot kell beírnod.");
        int sumOfNumbers = 0;
        for (i = 0; i <= userInput1; i++) {
            int userInput2 = scanner.nextInt();
            sumOfNumbers += userInput2;

        }
        double averageofNumbers = sumOfNumbers / userInput1;
        System.out.println("A számok összege: " + sumOfNumbers + ", a számok átlaga: " + averageofNumbers);

    }
}
