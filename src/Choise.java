import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Choise {
    // Мапа, яка зберігатиме відповідність номера завдання і назви класу
    private static final Map<Integer, String> taskMap = new HashMap<>();

    static {
        taskMap.put(1, "Min");
        taskMap.put(2, "Geometry");
        taskMap.put(3, "Masive");

    }

    public static void main(String[] args) {
        while (true) {
            // Створення об'єкту Scanner для зчитування введених даних з консолі
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть номер завдання: ");
            if (scanner.hasNextInt()) {
                // Запит номера завдання від користувача


                int taskNumber = scanner.nextInt();


                // Відкриття відповідного класу завдання
                openTask(taskNumber);
            } else if (scanner.next().equals("exit")) {
                System.out.println("Завдання завершено");
                break;
            } else {
                System.out.println("Невірна команда");
            }
        }
    }

    public static void openTask(int taskNumber) {
        String className = taskMap.get(taskNumber);
        if (className != null) {
            try {
                // Завантаження класу за іменем
                Class<?> cls = Class.forName(className);
                // Виклик методу main класу завдання
                Method method = cls.getMethod("main", String[].class);
                method.invoke(null, new Object[]{new String[]{}});
            } catch (Exception ignored) {

            }
        } else {
            System.out.println("Неправильний номер завдання.");
        }
    }
}