package Loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        /*
         Készíts egy programot, ami két számot kér
         Ha a második szám nem nagyobb, mint az első, írja ki:
         "A második számnak nagyobbnak kellene lennie!"

         Amennyiben nagyobb,
         az első számtól kezdve el kellene számolnia egyesével a másodikig

         Például:

         első szám: 3, második szám: 6, ezt kellene printelnie:

         3
         4
         5
        */
        System.out.println("Írj be két egész számot!");
        System.out.println("Az első szám:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("A második szám:");
        int number2 = scanner.nextInt();
        if (number2 <= number1){
            System.out.println("A második számnak nagyobbnak kellene lennie!");
    }
        else { int a = number1;
            while (a <= number2) {
                System.out.println(a);
                a ++;
            }

            }
        }
}
