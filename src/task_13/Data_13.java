package task_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

public class Data_13 {

    public static void main(String[] args) throws IOException {
        StringBuffer str = new StringBuffer();
        char c;
        String a;
        int count = 0;
        System.out.println("Введите слова латиницей и киррилицей через пробел: ");
        str = new StringBuffer();
        while ((c = (char) System.in.read()) != '\n')
            str.append(c);
        a = str.toString();
        Pattern p = Pattern.compile("([a-zA-z&&[^0-9]])+");
        Matcher m = p.matcher(a);
        System.out.println("Слова, состоящие из латиницы: ");
        while (m.find()) {
            System.out.print(m.group() + " ");
            if (m.group().length() != 0) {
                count++;
            }
        }
        System.out.println("\nКоличество слов на латинице - " + count);
    }
}







