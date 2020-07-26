package by.ita.evt.les03;

public class Task12_2 {

    public static void main(String[] args) {

        int[][] mas =
                       {{10, 11, 12, 13, 14},
                        {15, 16, 17, 18, 19},
                        {20, 21, 22, 23, 24},
                        {25, 26, 27, 28, 29},
                        {30, 31, 32, 33, 34}};

        //выводим массив
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
