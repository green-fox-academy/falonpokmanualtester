package Loops;
/*
 Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:

 % % % %
  % % % %
 % % % %
  % % % %
 % % % %
  % % % %
 % % % %
  % % % %

*/

public class DrawChessTable {
    public static void main(String[] args) {
        int row = 8;
        int column = 4;
        for (int b = 1; b <= row; b++) {
            for (int c = 1; c <= column; c++) {
                if (b % 2 == 0) System.out.print(" %");
                else System.out.print("% ");
            }
            System.out.println();
        }

    }
}
