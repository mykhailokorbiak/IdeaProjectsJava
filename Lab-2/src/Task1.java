public class Task1 {
    public static void run() {
        System.out.print("Введіть a: ");
        double a = Main.readDouble();
        System.out.print("Введіть b: ");
        double b = Main.readDouble();
        System.out.print("Введіть c: ");
        double c = Main.readDouble();
        double D = b*b - 4*a*c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2*a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Немає розв'язків");
        }
    }
}