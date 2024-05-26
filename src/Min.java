import java.util.Scanner;

public class Min {
    // Метод, який приймає три числа та повертає найменше
    public static int findMinimum(int a, int b, int c) {
        int min = a; // Початково вважаємо перше число мінімальним

        // Порівнюємо з другим числом
        if (b < min) {
            min = b;
        }
        // Порівнюємо з третім числом
        if (c < min) {
            min = c;
        }

        // Повертаємо мінімальне число
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();

        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();

        System.out.println("Введіть третє число:");
        int num3 = scanner.nextInt();

        int minimum = findMinimum(num1, num2, num3);
        System.out.println("Мінімальне число: " + minimum);


    }
}
