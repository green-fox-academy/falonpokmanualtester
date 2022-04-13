package Functions;
/*
 - Hozz létre egy class-t `Greet` névvel és benne a main függvényt.
 - Hozz létre egy `name` nevű String változót, aminek az értéke legyen `Green Fox`.
 - Készíts egy függvényt `greet` névvel mely üdvözli a bemeneti paraméterét kiírással(void & print)
   pl.: `Üdv, kedves Green Fox`
 - greet(`name`)
*/

public class Greet {
    public static void main(String[] args) {
        String name = "Green Fox";
        greet(name);
        System.out.println(greet(name));

    }
    public static String greet(String wtf){
        return wtf = "Üdv Kedves " + wtf + "!";

    }

}
