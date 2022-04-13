package Loops;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        /*
         Írj egy programot, ami egy számot kér a standard input-ból és egy
         ilyen piramist rajzol:


            *
           ***
          *****
         *******

         A piramisnak annyi sora legyen,
         mint amennyi az inputból kiolvasott szám értéke
        */
        System.out.println("Írj be egy számot!");
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        int k = 0;

        for (int i = 1; i <= lineCount; ++i, k = 0) {
            for (int space = 1; space <= lineCount - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();

            //google is my friend. i mean my best friend. ever.
        }
    }
}
