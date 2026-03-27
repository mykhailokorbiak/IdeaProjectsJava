public class Task42 {

    public static void run() {

        System.out.println("1 - Привітання");
        System.out.println("2 - Запрошення");
        System.out.println("3 - Завершення");
        int choice = Main.readInt();
        switch (choice) {
            case 1:
                System.out.println("Доброго дня!");
                break;
            case 2:
                System.out.println("Запрошуємо до роботи!");
                break;
            case 3:
                System.out.println("Завершуємо роботу");
                break;
            default:
                System.out.println("Невірний вибір");
        }
    }
}