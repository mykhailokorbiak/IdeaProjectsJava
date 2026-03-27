public class Task41 {
    public static void run() {
        System.out.print("Введіть x: ");
        double x = Main.readDouble();
        double f;
        if (x < 0)
            f = x*x + 3;
        else if (x <= 5)
            f = Math.pow(x, 1.0/5) + 5;
        else
            f = -x + Math.exp(x);
        System.out.println("f(x) = " + f);
    }
}