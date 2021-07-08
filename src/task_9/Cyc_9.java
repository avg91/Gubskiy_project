package task_9;

import java.util.Scanner;

public class Cyc_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Введите элементы массива:");
        for (double i = 0; i < size; i++) {
            array[(int) i] = input.nextDouble();
        }
        double sum = 0;
        for (double x : array) {
            sum += x;
        }
        double avg = sum / array.length;
        System.out.print("Среднее арифметическое чисел равно: " + avg);
        System.out.print("\nУмножаем элементы массива на среднее арифметическое:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "*" + avg + "=" + array[i] * avg);
        }
    }
}
