import java.util.Scanner;
public class FunctionTask {
    public static void calculateFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();
        double f;
        if (x < 0) {
            f = x * x + 3 * x;
        } else {
            f = Math.sin(x);
        }
        System.out.println("f(x) = " + f);
    }
}