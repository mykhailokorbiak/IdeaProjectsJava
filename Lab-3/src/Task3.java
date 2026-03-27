public class Task3 {

    public static void run() {

        int h = 0;

        while (h <= 2) {
            int m = 0;

            while (m < 60) {
                System.out.println(h + " h " + m + " min");
                m++;
            }

            h++;
        }
    }
}