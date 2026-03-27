import java.util.Scanner;

public class Task5 {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть нижню межу: ");
        double a = sc.nextDouble();

        System.out.print("Введіть верхню межу: ");
        double b = sc.nextDouble();

        int count = 0;

        System.out.println("\n=== FOR ===");

        for (double x = 0; x <= 2; x += 0.1) {

            double y = x * x;
            System.out.println("x = " + x + "  f(x) = " + y);

            if (y >= a && y <= b) {
                count++;
            }
        }

        if (count > 0)
            System.out.println("Кількість значень: " + count);
        else
            System.out.println("Таких значень немає");
    }
}