package task_10;

import java.util.Scanner;

public class Сус_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextInt();
        }
        System.out.print("Матрица выглядит так: \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Умножаем первую строку матрицы на 3: ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "*" + 3 + "=" + matrix[i][j] * 3 + "\t");
            }
            System.out.println();

        }
    }
}
