package Scanner;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy számot (mérföld)");
        int userInput2 = scanner.nextInt();
        double mileskm = 1.609344;
        double output = userInput2 * mileskm;
        System.out.println(userInput2 + " mérföld az " + output + " kilométer.");
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

    }
}
