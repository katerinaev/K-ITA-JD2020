package by.ita.evt.les03;
// Дана матрица. Вывести k-ю строку и p-й столбец матрицы
import java.util.Random;

public class Task02 {
    public static void main (String[] args) {
        int [][] mas = new int[4][5];
        Random rand = new Random();
        int k, p;
        k = 3;
        p = 3;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1000);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d] ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (i == k) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("[%4d] ", mas[i][j]);
                }
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {

                for (int j = 0; j < mas[i].length; j++) {
                    if (j == p) {
                        System.out.printf("[%4d] ", mas[i][j]);
                        System.out.println();
                    }
                }
        }
    }
}
