import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int b1 = 10;
        int b2 = 34;
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
            System.out.println("\n\nДані записані у файл.");
            FileReader reader = new FileReader(file);
            System.out.println("\nДані з файлу:");
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