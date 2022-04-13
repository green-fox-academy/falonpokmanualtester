package feladatok;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)

        String myname = "Cseh Krisztina";
        int myage = 37;
        double myheight = 1.78;
        boolean maritalstatus = false;

        System.out.println("Név: " + myname);
        System.out.println("Kor: " + myage);
        System.out.println("Magasság: " + myheight);
        System.out.println("Házas: " + maritalstatus);
    }
}
