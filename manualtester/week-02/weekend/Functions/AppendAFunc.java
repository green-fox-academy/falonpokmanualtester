package Functions;
/* - Hozz létre egy class-t `AppendAFunc` névvel és benne a main függvényt.

 - Hozz létre egy `typo` nevű String változót, aminek az értéke legyen `Chinchill`.
 - Készíts egy függvényt `appendAFunc` névvel mely hozzácsatol egy 'a'
   karaktert a függvény bemeneti paraméteréhez és String-ként adja vissza(return).

 - Írasd ki a visszatérési értékét a `appendAFunc(typo)` függvénynek. */
public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendAFunc(typo);
        System.out.println(appendAFunc(typo));

    }
    public static String appendAFunc (String letter){
        return letter = letter + "a";
    }
}
