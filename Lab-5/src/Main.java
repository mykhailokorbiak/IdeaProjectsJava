import java.util.Scanner;
public class Main {
    public static double areaRhombus(double d1, double d2) {
        return (d1 * d2) / 2;
    }
    public static int minOfThree(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Найменше число: " + min);
        return min;
    }
    public static void printArray(int[] array) {
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int maxInArray(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
    public static int inputInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Введи число, а не букви!");
                scanner.next();
            }
        }
    }
    public static double inputDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Спробуй ще раз.");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d1 = inputDouble(scanner, "Введіть першу діагональ ромба: ");
        double d2 = inputDouble(scanner, "Введіть другу діагональ ромба: ");
        double area = areaRhombus(d1, d2);
        System.out.println("Площа ромба = " + area);
        int a = inputInt(scanner, "Введіть перше число: ");
        int b = inputInt(scanner, "Введіть друге число: ");
        int c = inputInt(scanner, "Введіть третє число: ");
        minOfThree(a, b, c);
        int n = inputInt(scanner, "Введіть кількість елементів масиву: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inputInt(scanner, "arr[" + i + "] = ");
        }
        printArray(arr);
        int max = maxInArray(arr);
        System.out.println("Найбільше число в масиві: " + max);
        scanner.close();
    }
}
