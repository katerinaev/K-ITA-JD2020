package by.ita.evt.les01;

public class Task04 {
    // Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8
    public static void main(String[] args) {
        double odin = 500;
        double dva = 100;
        if (odin < dva) {
            System.out.println(7);
        }
        else System.out.println(8);
    }
}
