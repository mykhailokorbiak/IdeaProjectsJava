import java.util.Scanner;
public class Task3 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введіть кількість елементів: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                break;
            } else {
                System.out.println("Помилка! Введіть ціле число.");
                sc.next();
            }
        }
        double[] numbers = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("numbers[" + i + "] = ");
                if (sc.hasNextDouble()) {
                    numbers[i] = sc.nextDouble();
                    sum += numbers[i];
                    break;
                } else {
                    System.out.println("Помилка! Введіть число.");
                    sc.next();
                }
            }
        }
        System.out.println("Сума = " + sum);
    }
}