package task_7;

import java.util.Scanner;

public class Cyc_7 {
    public static void main(String[] args) {
        final int x = 5; // константы
        final int y = 10;
        final int z = 15;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println("Данное значение уже имеется в константах");
            }
        }
        System.out.print("Массив содержит элементы:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
    }
}