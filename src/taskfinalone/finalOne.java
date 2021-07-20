package taskfinalone;

import java.util.Scanner;

public class finalOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double x = scanner.nextInt();
        System.out.println("Введите количество рублей: ");
        double y = scanner.nextInt();
        double result = y / x;
        System.out.printf("По текущему курсу получается рублей: " + "%.2f", result);
    }
}
