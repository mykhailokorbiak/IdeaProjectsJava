# Лабораторна робота №8
## Потоки вводу/виводу. Робота з файлами

## Мета роботи
Набуття навичок опрацювання основних класів і методів роботи з потоками та файлами.

---

# Хід роботи

## Умова задачі

1. Реалізувати програму, що записує у файл послідовність випадкових чисел у заданому діапазоні.
2. Ім’я файлу та межі діапазону передаються через параметри командного рядка.
3. Передбачити перевірку існування файлу.
4. Прочитати дані з файлу та вивести їх на консоль.

---

# Код програми

```java
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        if (args.length < 3) {

            System.out.println("Введіть:");
            System.out.println("java Main ім'я_файлу мін максимум");

            return;
        }

        String fileName = args[0];

        int b1 = Integer.parseInt(args[1]);
        int b2 = Integer.parseInt(args[2]);

        File file = new File(fileName);

        try {

            if (!file.exists()) {

                file.createNewFile();

                System.out.println("Файл створено.");
            }

            FileWriter writer = new FileWriter(file);

            Random random = new Random();

            System.out.println("Згенеровані числа:");

            for (int i = 0; i < 10; i++) {

                int num = random.nextInt(b2 - b1 + 1) + b1;

                writer.write(num + " ");

                System.out.print(num + " ");
            }

            writer.close();

            System.out.println("\\n\\nДані записані у файл.");

            FileReader reader = new FileReader(file);

            System.out.println("\\nДані з файлу:");

            int ch;

            while ((ch = reader.read()) != -1) {

                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Помилка роботи з файлом!");

            e.printStackTrace();
        }
    }
}
```

---

# Результат виконання програми

При запуску команди:

```bash
java Main numbers.txt 10 50
```

Програма:
- створює файл `numbers.txt`;
- генерує випадкові числа;
- записує їх у файл;
- читає дані з файлу;
- виводить інформацію на консоль.

---

# Висновок

У ході лабораторної роботи було освоєно роботу з потоками вводу/виводу в Java. Було використано класи FileWriter та FileReader для запису та читання даних з текстового файлу. Також було реалізовано перевірку існування файлу та генерацію випадкових чисел у заданому діапазоні.
