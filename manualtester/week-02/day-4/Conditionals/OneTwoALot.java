package Conditionals;
import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy egész számot!");
        int userInput1 = scanner.nextInt();
        if (userInput1 == 0) {
            System.out.println("Nem elég.");
        }
        else if (userInput1 == 1) {
            System.out.println("Egy.");
        }
        else if (userInput1 == 2) {
            System.out.println("Kettő.");
        }
        else {
            System.out.println("Sok.");
        }

        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
        // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
        // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
        // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"

    }
}
