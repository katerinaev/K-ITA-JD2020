package by.ita.evt.les01;

public class Task03 {
    // Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации
    public static void main(String[] args) {
        double a = 1000;
        double kb;
        double mb;
        double tb;
        kb = a / Math.pow(10, 3);
        mb = a / Math.pow(10, 6);
        tb = a / Math.pow(10, 9);

        System.out.println("В " + a + " байтах " + kb + " килобайт " + mb + " мегабайт " + tb + " террабайт");
    }
}
