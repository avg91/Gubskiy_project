package task_14;

public class Data_14 {

    public static void main(final String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 40) - 20);
            System.out.println(array[i]);
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) max = Math.max(max, array[i]);
        System.out.println("\nМаксимальное значение массива: " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) min = Math.min(min, array[i]);
        System.out.println("Минимальное значение массива: " + min);

        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Наибольшее число по модулю " + Math.abs(max));
        } else {
            System.out.println("Наибольшее число по модулю " + Math.abs(min)); // в задании не указано, выводить сам модуль или просто число, которое больше по модулю, поэтому вывожу модуль

        }
    }

}