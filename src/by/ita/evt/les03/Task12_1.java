package by.ita.evt.les03;

public class Task12_1 {
    public static void main(String[] args) {

        int[][] mas = new int[5][7];

        // создаем двумерный массив из случайных чисел из отрезка [0;1]

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random()*10);
            }
        }
        // вывод массива
        //System.out.println("Исходный массив :");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}