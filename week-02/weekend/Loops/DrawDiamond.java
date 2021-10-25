package Loops;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        // Írj egy programot, ami egy számot kér a standard input-ból és egy
         // ilyen rombuszt rajzol:
         //
         //    *
         //   ***
         //  *****
         // *******
         //  *****
         //   ***
         //    *
         //
         // A rombusznak annyi sora legyen,
         // mint amennyi az inputból kiolvasott szám értéke

        //System.out.println("Írj be egy számot!");
        //Scanner scanner = new Scanner(System.in);
        int lineCount = 5;   //scanner.nextInt();

        for (int i = 1; i <= lineCount; i++) { // sorok száma
            for (int j = i; j <= lineCount; j++) { // csillagok száma
                System.out.print("*");
            }
            //for (int j = 1; j < i; j++) { // csillagok száma
              //  System.out.print("*");
            //}
            //for (int j =1; j <= i; j++) {
             //   System.out.println("*");
            //}
            System.out.println();
        }

        }
    }