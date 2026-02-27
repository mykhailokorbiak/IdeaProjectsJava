public class Task5 {
    public static void run() {
        int n = 653;
        int last = n % 10;
        int middle = (n / 10) % 10;
        int first = n / 100;
        int reversed = last * 100 + middle * 10 + first;

        System.out.println("Завдання 5");
        System.out.println(n + " => " + reversed);
    }
}