package by.ita.evt.les03;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//          1   2   3 .... n
//          n   n-1 n-2....1
//          1   2   3   ...n
//          n
public class Task04 {
    public static void main (String[] args) {
        int n;
        n = 8;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
            if (i % 2 == 0) {
                mas[i][j] = j + 1;
                }
                else {
                     mas[i][j] = n - j;
                    }
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%3d ", mas[i][j]);
            }
            System.out.println();
        }
    }
}
