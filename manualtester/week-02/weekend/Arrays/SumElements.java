package Arrays;
// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[54, 23, 66, 12]`
// - Írasd ki a konzolra a `numbers` nevű tömb második és harmadik elemének összegét

public class SumElements {
    public static void main(String[] args) {
        int[] numbers = {54, 23, 66, 12};
        System.out.println("A tömb második és harmadik elemének összege:" + (numbers[1] + numbers[2]));
    }
}
