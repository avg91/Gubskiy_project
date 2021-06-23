package task_3;

public class arrays {
    public static void main(String[] args) {
        // Создаем массив и присваеваем значения элементам
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Меняем местами значения первого и последнего элемента
        int temp = array[array.length -1]; // значение последнего элемента
        array[4] = array[0];
        array[0] = temp;

        // Выводим сумму первого (50) и среднего (30) элементов
        System.out.println(array[array.length -5] + array[array.length -3]);
    }
}