package Loops;

import java.util.Scanner;

/*
 Írj egy programot, ami egy számot kér a standard input-ból és egy
 ilyen négyzetet rajzol:


 %%%%%%
 %    %
 %    %
 %    %
 %    %
 %%%%%%

 A négyzetnek annyi sora legyen,
 mint amennyi az inputból kiolvasott szám értéke
*/
public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Írj be egy számot!");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        for (int b = 1; b <= row; b++) {
                if (b == 1 || b == row) System.out.println("%%%%%%");
                else System.out.println("%    %");
            }

    }
}
