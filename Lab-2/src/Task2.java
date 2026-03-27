public class Task2 {
    public static void run() {
        System.out.print("Введіть x: ");
        double x = Main.readDouble();
        System.out.print("Введіть y: ");
        double y = Main.readDouble();
        if (x > 0 && y > 0)
            System.out.println("1 квадрант");
        else if (x < 0 && y > 0)
            System.out.println("2 квадрант");
        else if (x < 0 && y < 0)
            System.out.println("3 квадрант");
        else if (x > 0 && y < 0)
            System.out.println("4 квадрант");
        else
            System.out.println("На осі");
    }
}