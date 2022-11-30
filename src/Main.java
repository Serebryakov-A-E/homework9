import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //task 1
        int sum = Arrays.stream(generateRandomArray()).sum();
        System.out.printf("Сумма трат за месяц составила %,d рублей\n", sum);

        //task2
        System.out.printf("Максимальная сумма трат за день составила %,d рублей\n", max(generateRandomArray()));
        System.out.printf("Максимальная сумма трат за день составила %,d рублей\n", min(generateRandomArray()));

        //task 3
        double average = sum / 30.0;
        System.out.printf("Средняя сумма трат за месяц составила %,.3f рублей\n", average);

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int max(int[] array) {
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = 200_000;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] generateRandomArray() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100_000) + 100_000;
        }
        return array;
    }
}