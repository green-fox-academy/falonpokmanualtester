package Conditionals;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy egész számot, megmondom, páros vagy páratlan!");
        int userInput1 = scanner.nextInt();
        if (userInput1 % 2 == 0) {
            System.out.println("Páros.");
        }
        else {
            System.out.println("Páratlan.");
        }

        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.

    }
}
