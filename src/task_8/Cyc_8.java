package task_8;

import java.util.Scanner;

public class Cyc_8 {
    public static void main(String[] args) {
        int start = 1; // считаем от
        int finish = 0; // считаем до
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        finish = in.nextInt();
        int i = start;
        while (i <= finish) {
            if (i % 2 != 0) {
                System.out.println(i + " "); // выводим все нечетные числа
                sum += i;
            }
            i++;
        }
        System.out.println("Сумма нечетных чисел от " + start + " до " + finish + " = " + sum);
    }
}