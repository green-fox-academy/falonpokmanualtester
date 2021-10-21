package feladatok;

public class Cuboid {
    public static void main(String[] args) {
// Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000

        double a = 5.;
        double b = 10;
        double c = 20.;

        double felulet = (2 * (a * b) + (a * c) + (b * c));
        double terfogat = (a * b * c);
        System.out.println("Felület: " + felulet);
        System.out.println("Térfogat: " + terfogat);
    }
}
