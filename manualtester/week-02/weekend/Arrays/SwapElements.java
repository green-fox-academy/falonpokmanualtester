package Arrays;
/*
 - Készíts egy `orders` nevű változót (tömböt)
   a következő tartalommal (értékekkel): `["first", "second", "third"]`
 - Cseréld fel az első és a harmadik elemet az `orders` tömbben
*/

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        String temp = orders[0];
        orders[0] = orders[2];
        orders[2] = temp;
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
}
}
