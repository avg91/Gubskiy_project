package taskfinalfour;

import java.util.Scanner;

public class finalFour {
    public static void main(String[] args) {
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";
        int attempts = 3;
        String help = "Подсказка";
        String hint = "Подсказка: это вирус. Но какой?";
        String not_hint = "Подсказка уже недоступна";
        String ok = "Правильно!";
        String think_again = "Подумай еще!";
        String bye = "Обидно, приходи в другой раз";
        Scanner in = new Scanner(System.in);
        System.out.println(riddle);
        for (int attempt = 1; attempt <= attempts; ++attempt) {
            String userResponse = in.nextLine();
            if (userResponse.equals(answer)) {
                System.out.println(ok);
                return;
            } else if (attempt == attempts) {
                System.out.println(bye);
            } else if (attempt == 1 && userResponse.equals(help)) {
                System.out.println(hint);
                if (in.nextLine().equals(answer)) {
                    System.out.println(ok);
                } else {
                    System.out.println(bye);
                }
                return;
            } else if (attempt != 1 && userResponse.equals(help)) {
                System.out.println(not_hint);
                attempt--;
            } else {
                System.out.println(think_again);
            }
        }
    }
}

