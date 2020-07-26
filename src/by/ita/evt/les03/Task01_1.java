package by.ita.evt.les03;

public class Task01_1 {


    public static void main(String[] args) {
//        int matrix[][] = new int[][]{{2, 3, 4}, {8, 2, 9}, {10, 6, 2}};
        int[][] mas =
                       {{1, 0, 0, 0, 0},
                        {0, 2, 0, 0, 0},
                        {0, 0, 3, 0, 0},
                        {0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 5}};

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][i] + " ");

        }
    }
}
