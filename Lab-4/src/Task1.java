public class Task1 {
    public void run() {
        int[] even = new int[50];
        int[] odd = new int[50];
        for (int i = 0; i < 50; i++) {
            even[i] = i * 2;
            odd[i] = i * 2 + 1;
        }
        System.out.println("Парні числа:");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\n\nНепарні числа:");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
}