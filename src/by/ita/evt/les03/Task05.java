package by.ita.evt.les03;

public class Task05 {
    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//0		0		0		0		.....0		1
//0		0		0		0		.....2		0
//
//n		0		0		0		.....0		0
    public static void main(String[] args) {
        int n;
        n = 8;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][n - i - 1] = i + 1;
            }
        }

        for (int i = 0; i < mas.length; i ++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }

    }
}
