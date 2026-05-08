import java.util.Scanner;
class Triangle {
    double a;
    double b;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи катет a: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Помилка! Введи число:");
            sc.next(); // очищає неправильний ввід
        }
        a = sc.nextDouble();
        System.out.print("Введи катет b: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Помилка! Введи число:");
            sc.next();
        }
        b = sc.nextDouble();
    }
    double gip() {
        return Math.sqrt(a * a + b * b);
    }
    void info() {
        System.out.println("Гіпотенуза: " + gip());
    }
}