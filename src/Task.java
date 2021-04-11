import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {

    private static final Scanner IN = new Scanner(System.in);

    private static final List<String> TASKS = new ArrayList<>();

    public static void main(String[] args) {
        before:
        while (true) {
            System.out.print("Выберите действие:\n1. Добавить задачу\n2. Вывести список задач\n3. Удалить задачу\n0. Выход");
            String value = IN.nextLine();
            switch (value) {
                case "1":
                    addTask();
                    break;
                case "2":
                    taskList();
                    break;
                case "3":
                    removeTask();
                    break;
                case "0":
                    break before;
                default:
                    System.out.println("Попробуйте ещё раз");
                    break;
            }
        }
    }

    private static void addTask() {
        System.out.print("Введите задачу для планирования: ");
        String task = IN.nextLine();
        TASKS.add(task);
    }

    private static void taskList() {
        System.out.println("Список задач:");
        for (int i = 0; i < TASKS.size(); i++) {
            System.out.println(i + 1 + ". " + TASKS.get(i));
        }
    }

    private static void removeTask() {
        System.out.println("Введите номер задачи для удаления: ");
        int position = Integer.parseInt(IN.nextLine());
        TASKS.remove(position - 1);
    }
}