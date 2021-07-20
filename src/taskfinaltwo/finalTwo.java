package taskfinaltwo;

import java.util.Scanner;

public class finalTwo {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        char [] u=s.toCharArray();
        //определяем знак
        int znak=1;  //плюс по умолчанию, домножение на 1
        int x=0;
        if ('-'== u[1])
            znak=-1;   //минус  (домножение числа на -1 )

        //Ищем в какой позиции икс и вычисляем
        if ('x'== u[0])
            x=Character.digit(u[4],10)+znak*-1*Character.digit(u[2],10);
        else
        if ('x'== u[2])
            x=(Character.digit(u[4],10)+Character.digit(u[0],10)*-1)/znak;
        else
        if ('x'== u[4])
            x=Character.digit(u[0],10)+Character.digit(u[2],10)*znak;
        //вывод x
        System.out.println(x);
    }

}

