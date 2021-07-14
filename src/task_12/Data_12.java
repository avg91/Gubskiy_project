package task_12;

public class Data_12 {
    public static void main(String[] args) {
        String str  = "I like Java!!!";
        if (str.contains("Java") & (str.startsWith("I like") & (str.endsWith("!!!")))) {
            System.out.println(str.toUpperCase());
            String str1 = str.replace("a", "o");
            System.out.println(str1.substring(7, 11 ));
        }
        else {
            System.out.println("Какое-то из условий неверно, ничего не делаем");
        }
    }
}