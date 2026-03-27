public class Task5While {

    public static void run() {

        double x = 0;

        System.out.println("\n=== WHILE ===");

        while (x <= 2) {

            double y = x * x;
            System.out.println("x = " + x + "  f(x) = " + y);

            x += 0.1;
        }
    }
}