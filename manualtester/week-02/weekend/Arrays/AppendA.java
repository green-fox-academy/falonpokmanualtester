package Arrays;
/*
 - Készíts egy `animals` nevű változót (tömböt)
   a következő tartalommal (értékekkel): `["koal", "pand", "zebr"]`
 - Minden elemhez csatolj egy "a" betűt a szó végére
*/

public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        for (int i = 0; i < animals.length; i++) {
            animals[i] += "a";
            System.out.println(animals[i]);
        }
    }
}
