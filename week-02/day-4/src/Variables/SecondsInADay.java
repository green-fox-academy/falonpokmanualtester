package Variables;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int hoursperday = 24;
        int minutesperhour = 60;
        int secondsperminute = 60;
        int secondsperday = hoursperday * minutesperhour * secondsperminute;
        int remainingseconds = secondsperday - ((currentHours * 60 * 60) + (currentMinutes * 60) + (currentSeconds));
        System.out.println(remainingseconds + " másodperc van hátra a napból.");
        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)
    }
}
