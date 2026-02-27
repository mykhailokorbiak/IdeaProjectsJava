public class Task3 {
    public static void run() {
        User[] users = new User[10];
        users[0] = new User(1, 18, "Іван", "Лев", 70.5, 1.78);
        users[1] = new User(2, 20, "Оля", "Мельник", 55.2, 1.65);
        users[2] = new User(3, 22, "Петро", "Коваль", 80.0, 1.82);
        users[3] = new User(4, 19, "Анна", "Шевчук", 60.0, 1.70);
        users[4] = new User(5, 25, "Тарас", "Бондар", 90.0, 1.90);
        users[5] = new User(6, 21, "Марія", "Дяк", 50.0, 1.60);
        users[6] = new User(7, 23, "Денис", "Романюк", 75.0, 1.75);
        users[7] = new User(8, 24, "Ірина", "Сокіл", 62.0, 1.68);
        users[8] = new User(9, 26, "Артем", "Кравець", 68.0, 1.73);
        users[9] = new User(10, 27, "Назар", "Гнатюк", 72.0, 1.77);

        int totalAge = 0;
        double totalWeight = 0, totalHeight = 0;

        for (User u : users) {
            totalAge += u.getAge();
            totalWeight += u.getWeight();
            totalHeight += u.getHeight();
        }

        System.out.println("Завдання 3");
        System.out.println("Сума віку = " + totalAge);
        System.out.println("Сума ваги = " + totalWeight);
        System.out.println("Сума зросту = " + totalHeight);
        System.out.println();
    }
}