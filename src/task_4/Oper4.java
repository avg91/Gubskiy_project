package task_4;

import java.util.Scanner;

public class Oper4 {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите 1 число" );
                int x = scanner.nextInt();
                System.out.println("Введите 2 число" );
                int y = scanner.nextInt();
                System.out.println("Введите 3 число" );
                int z = scanner.nextInt();
                int avg = (x + y + z) / 3;
                        System.out.println("Среднее арифметическое введенных чисел равно " + avg);
                int a = avg/2;
                if (a > 3){
                        System.out.println("Программа выполнена корректно");
                }
        }}

