public class Task1 {
    public static void run() {
        String text = "Java - це круто!";
        System.out.println("=== for ===");
        for (int i = 0; i < 50; i++) {
            System.out.println(text);
        }
        System.out.println("\n=== while ===");
        int i = 0;
        while (i < 50) {
            System.out.println(text);
            i++;
        }
    }
}