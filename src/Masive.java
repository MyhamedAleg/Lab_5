import java.util.Scanner;

public class Masive {
    // Метод, який приймає три числа та повертає найменше
    public static int findMaximum(int a, int b, int c) {
        int max = a; // Початково вважаємо перше число мінімальним

        // Порівнюємо з другим числом
        if (b > max) {
            max = b;
        }
        // Порівнюємо з третім числом
        if (c > max) {
            max = c;
        }

        // Повертаємо мінімальне число
        return max;
    }

    // Метод для виведення масиву на екран
    public static void printArray(int[] array) {
        System.out.print("Масив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();

        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();

        System.out.println("Введіть третє число:");
        int num3 = scanner.nextInt();

        int maximum;
        maximum = findMaximum(num1, num2, num3);
        System.out.println("Найбільше число : " + maximum);

        System.out.println("Введіть кількість елементів масиву:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        printArray(array);


    }
}
