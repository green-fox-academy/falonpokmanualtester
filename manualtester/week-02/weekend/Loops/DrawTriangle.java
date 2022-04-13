package Loops;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        /*
        Hozz létre egy egész szám típusú, lineCount nevű változót.
        Írj egy programot, ami egy számot kér a standard input-ból és
        elmenti azt a lineCount változóban.
        Rajzoljon egy ilyen háromszöget:
            *
            **
            ***
            ****
           A háromszögnek annyi sora legyen, mint amennyi a lineCount értéke.
        */
        System.out.println("Írj be egy számot!");
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        for (int a = 1; a <= lineCount; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}