public class Task1 {
        public static void run() {
            int a = 1000, b = 20, c = 5, d = 2, e = 3, f = 4, g = 10, h = 6, i = 2, j = 1;

            int sum = a + b + c + d + e + f + g + h + i + j;
            int sub = a - b - c - d - e - f - g - h - i - j;
            long mul =  a * b * c * d * e * f * g * h * i * j;
            double div = (double) a / b / c / d / e / f / g / h / i / j;

            System.out.println("Завдання 1");
            System.out.println("Сума = " + sum);
            System.out.println("Віднімання = " + sub);
            System.out.println("Множення = " + mul);
            System.out.println("Ділення = " + div);
            System.out.println();
        }
}
