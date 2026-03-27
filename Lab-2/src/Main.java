import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static double readDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Помилка! Введіть число:");
            sc.next();
        }
        return sc.nextDouble();
    }
    public static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Помилка! Введіть число:");
            sc.next();
        }
        return sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Task1");
        Task1.run();
        System.out.println("\nTask2");
        Task2.run();
        System.out.println("\nTask3");
        Task3.run();
        System.out.println("\nTask41");
        Task41.run();
        System.out.println("\nTask42");
        Task42.run();
    }
}