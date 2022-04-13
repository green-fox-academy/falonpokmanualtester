package Arrays;
/*
 - Készíts (dinamikusan*) egy kétdimenziós tömböt
   a következő mátrix-szal**. Ciklust (loop-ot) használj!

   1 0 0 0
   0 1 0 0
   0 0 1 0
   0 0 0 1

 - Írasd ki a konzolra ezt a kétdimenziós tömböt
 * A tömb hossza egy változótól kell függjön
 ** Nyugalom, egy mátrix pont olyan, mint egy tömb
*/

public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] tomb = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();

        }
    }
}
