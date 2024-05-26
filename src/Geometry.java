import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину бази паралелограма: ");
        double baseLength = scanner.nextDouble();

        System.out.print("Введіть висоту паралелограма: ");
        double height = scanner.nextDouble();

        double parallelogramArea = baseLength * height;
        System.out.println("Площа паралелограма: " + parallelogramArea);


    }
}
