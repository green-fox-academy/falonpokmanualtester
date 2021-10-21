package Scanner;
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egymás után 5 egész számot!");
        System.out.println("Első szám:");
        double userInput1 = scanner.nextInt();
        System.out.println("Második szám:");
        double userInput2 = scanner.nextInt();
        System.out.println("Harmadik szám:");
        double userInput3 = scanner.nextInt();
        System.out.println("Negyedik szám:");
        double userInput4 = scanner.nextInt();
        System.out.println("Ötödik szám:");
        double userInput5 = scanner.nextInt();
        System.out.println("Köszönöm, már számolom is.");
        double osszeg = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        double atlag = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;

        System.out.println("A beírt számok összege: " + osszeg + ", átlaga: " + atlag);

        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
    }
}
