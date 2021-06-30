package task_5;

import java.util.Scanner;

public class Oper5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число" );
        int x = scanner.nextInt();
        System.out.println("Введите 2 число" );
        int y = scanner.nextInt();
        System.out.println("Введите одну из арифметических операций +,-,*,/");
        String z = scanner.next();
        if (z.equals("+"))
            System.out.println(x + y);
        else if (z.equals("-"))
            System.out.println(x - y);
        else if (z.equals("*"))
            System.out.println(x * y);
        else if (z.equals("/"))
            System.out.println(x / y);
        else {
            System.out.println("Вы ввели что-то другое и все поломали");
        }
        }}
