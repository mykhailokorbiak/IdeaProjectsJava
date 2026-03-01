import java.util.Scanner;
public class MenuTask {
    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Меню:");
        System.out.println("1 - Привітання");
        System.out.println("2 - Запрошення до роботи");
        System.out.println("3 - Завершити роботу");
        System.out.print("Ваш вибір: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Доброго дня! Раді вас бачити!");
                break;
            case 2:
                System.out.println("Запрошуємо до роботи за комп’ютером!");
                break;
            case 3:
                System.out.println("Роботу завершено. До побачення!");
                break;
            default:
                System.out.println("Невірний вибір!");
        }
    }
}