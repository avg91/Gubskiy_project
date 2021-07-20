package taskfinalthree;

import java.util.Scanner;

public class finalThree {
    public static int uniqChar(String s) {
        int k = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int u = 1; // Признак уникальности
            //Проверяем очередной символ, не встречался ли он ранее
            for (int j = i - 1; j > -1; j--)
                if (c[i] == c[j]) {
                    u = 0;
                    break;
                }
            if (u == 1)
                k++;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.print("Количество строк: ");
        int n = new Scanner(System.in).nextInt();
        String[] s = new String[n];
        Scanner Scan = new Scanner(System.in);
        int k = 0; //По умолчанию считаем что максимум в первой строке
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            s[i] = Scan.nextLine();
            if (uniqChar(s[i]) > uniqChar(s[k]))
                k = i; //запоминаем номер строки с макс.
        }

        System.out.println("Ответ: " + s[k]);

    }

}

