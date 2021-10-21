package feladatok;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét
        // Készít egy scanner-t
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a neved!");

        // A program megáll és vár a felhasználói input-ra, illetve utána az enter megnyomására
        String userInput1 = scanner.nextLine();

        // Utána kiírja a felhasználó által beírt sor egészét
        System.out.println("Hello " +userInput1 + "!");



    }
}
