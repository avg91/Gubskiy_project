package task_11;

import java.util.Scanner;

public class Data_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String a_str = input.nextLine();
        int a_int = Integer.parseInt(a_str);
        System.out.println("Введите второе число:");
        int b_int = input.nextInt();
        if (a_int == b_int){
            System.out.println("Числа равны, выводить большее и меньшее не будем");
        }
        else {
            System.out.println("Большее число: " + Math.max(a_int, b_int));
            double c = Math.min(a_int, b_int);
            System.out.println("Меньшее число в double: " + c);
        }
    }}

