package task_6;

import java.util.Scanner;

public class Oper6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, что будем переводить: \n 1. Масса \n 2. Расстояние" );
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Выберите единицу измерения: \n 1. Киллограм \n 2. Грамм \n 3. Тонна " );
            int y = scanner.nextInt();
            if (y == 1) {
                System.out.println("Введите число: " );
                int k = scanner.nextInt();
                System.out.println("Результат:\nКиллограммы: " + k);
                System.out.println("Граммы: " + k * 1000);
                System.out.println("Тонны: " + k / 1000);
            }
            else if (y == 2) {
                System.out.println("Введите число: " );
                int g = scanner.nextInt();
                System.out.println("Результат:\nГраммы: " + g);
                System.out.println("Килограммы: " + g / 1000);
                System.out.println("Тонны: " + g / 1000000);
            }
            else if (y == 3) {
                System.out.println("Введите число: " );
                int t = scanner.nextInt();
                System.out.println("Результат:\nТонны: " + t);
                System.out.println("Килограммы: " + t * 1000);
                System.out.println("Граммы: " + t * 1000000);
            }
            else
                System.out.println("Вы выбрали что-то не то");

        }
        else if  (x == 2) {
            System.out.println("Выберите единицу измерения: \n 1. Метр \n 2. Миля \n 3. Ярд \n 4. Фут" );
        int z = scanner.nextInt();
        if (z == 1) {
            System.out.println("Введите число: " );
            int m = scanner.nextInt();
            System.out.println("Результат:\nМетры: " + m);
            System.out.println("Мили: " + m * 0.00062);
            System.out.println("Ярды: " + m * 1.09);
            System.out.println("Футы: " + m * 3.28);
        }
        else if (z == 2){
            System.out.println("Введите число: " );
            int ml = scanner.nextInt();
            System.out.println("Результат:\nМили: " + ml);
            System.out.println("Метры: " + ml * 1609.34);
            System.out.println("Ярды: " + ml * 1760);
            System.out.println("Футы: " + ml * 5280);
        }
        else if (z == 3) {
            System.out.println("Введите число: " );
            int ya = scanner.nextInt();
            System.out.println("Результат:\nЯрды: " + ya);
            System.out.println("Метры: " + ya * 0.91);
            System.out.println("Мили: " + ya * 0.00057);
            System.out.println("Футы: " + ya * 3);
        }
        else if (z == 4) {
            System.out.println("Введите число: " );
            int ft = scanner.nextInt();
            System.out.println("Результат:\nФуты: " + ft);
            System.out.println("Метры: " + ft * 0.3 );
            System.out.println("Мили: " + ft * 0.00019 );
            System.out.println("Ярды: " + ft * 0.33);
        }
        else
            System.out.println("Вы выбрали что-то не то");
        }
        else
            System.out.println("Вы выбрали что-то не то");

        }}