package Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írd be, hány tyúk van!");
        int userInput1 = scanner.nextInt();
        System.out.println("Írd be, hány disznó van!");
        int userInput2 = scanner.nextInt();
        int tyuklab = 2;
        int disznolab = 4;
        int output = (userInput1 * tyuklab) + (userInput2 * disznolab);
        System.out.println("A farmon lévő állatoknak összesen " + output + " lábuk van.");

        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon
    }
}
