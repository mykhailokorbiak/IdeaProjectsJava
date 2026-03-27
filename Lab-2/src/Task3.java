public class Task3 {
    public static void run() {
        System.out.print("Введіть число: ");
        int n = Main.readInt();
        if (((n >= 10 && n <= 99) || (n <= -10 && n >= -99)) && n % 2 == 0)
            System.out.println("Двозначне і парне");
        else
            System.out.println("Не підходить");
    }
}