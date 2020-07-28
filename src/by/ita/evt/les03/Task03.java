package by.ita.evt.les03;
// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
//строка слева направо, третья строка справа налево и так далее
import java.util.Random;

public class Task03 {
    public static void main (String[] args) {
        int m;
        int n;
        m = 4;
        n = 5;
        int mas[][] = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1000);
            }

        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                for (int j = mas[i].length - 1; j >= 0; j--) {
                    System.out.printf("%4d ", mas[i][j]);
                }
                System.out.println();
            } else {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("%4d ", mas[i][j]);
                }
                System.out.println();
            }
        }

    }
}
