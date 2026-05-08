import java.util.HashMap;
public class PhoneBook {
    public static void run() {
        HashMap<String, String> book = new HashMap<>();
        book.put("Іваненко", "111111");
        book.put("Петренко", "222222");
        book.put("Сидоренко", "333333");
        book.put("Коваль", "444444");
        book.put("Шевченко", "555555");
        book.put("Бойко", "666666");
        book.put("Ткаченко", "777777");
        book.put("Кравченко", "888888");
        book.put("Олійник", "999999");
        book.put("Гнатюк", "000000");
        System.out.println("\nТелефонна книга");
        for (String key : book.keySet()) {
            System.out.println(key + " -> " + book.get(key));
        }
        String name = "Петренко";
        if (book.containsKey(name)) {
            System.out.println("\nЗнайдено: " + book.get(name));
        } else {
            System.out.println("\nУ книзі відсутній такий абонент");
        }
        if (book.containsValue("333333")) {
            System.out.println("\nНомер 333333 є у книзі");
        }
        book.remove("Іваненко");
        System.out.println("\nКількість записів: " + book.size());
    }
}