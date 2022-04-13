package feladatok;

public class VariableMutation {
    public static void main(String[] args) {
        // Növeld meg az "a" változó értékét 10-zel

        int a = 3;
        a += 10;
        System.out.println(a);


        // Csökkentsd a "b" változó értékeét 7-tel
        int b = 100;
        b -= 7;
        System.out.println(b);


        // A c értéke legyen dupla akkora
        int c = 44;
        c *= 2;
        System.out.println(c);


        // Oszd el a d-t 5-tel
        int d = 125;
        d /= 5;
        System.out.println(d);



        // Emeld köbre az e változó értékét
        int e = 8;
        e *= e * e;
        System.out.println(e);


        // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
        int f1 = 123;
        int f2 = 345;
        if (f1 > f2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }



        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        int g1 = 350;
        int g2 = 200;
        if (g2 * 2 > g1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként
        int h = 135798745;
        if (h % 11 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)
        int i1 = 10;
        int i2 = 3;
        if (i1 > i2 * i2 && i1 < i2 * i2 * i2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        int j = 1521;
        if (j % 3 == 0 || j % 5 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
