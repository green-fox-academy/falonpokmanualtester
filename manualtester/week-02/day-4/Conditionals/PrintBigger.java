package Conditionals;
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egymás után 2 különböző egész számot!");
        System.out.println("Első szám:");
        int userInput1 = scanner.nextInt();
        System.out.println("Második szám:");
        int userInput2 = scanner.nextInt();
        if (userInput1 > userInput2) {
            System.out.println(userInput1 + " a nagyobb.");
        }
        else if (userInput1 < userInput2) {
            System.out.println(userInput2 + " a nagyobb.");
        }



        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat
    }
}
