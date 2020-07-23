package by.ita.evt.les01;

public class Task05 {
    //Составить программу: определения наименьшего из двух чисел а и b
    public static void main(String[] args) {

        int a = 0;
        int b = 10;

        if (a < b) {
            System.out.println("Число a меньшее");
        } else if (a > b) {
            System.out.println("Число b меньшее или равно");
        } else {
            System.out.println("Они равны");
        }
    }
}
