public class Task4 {
    public void run() {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        System.out.println("Початковий масив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -arr[i];
            }
        }
        System.out.println("\n\nПісля зміни:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}