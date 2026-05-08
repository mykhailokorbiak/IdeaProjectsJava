public class Task2 {

    public void run() {
        int[] arr = {2, 11, 15, 8, 22, 31, 35, 67, 100, -40};
        System.out.println("while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("\n\nfor:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n\nНепарні індекси:");
        i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }
        System.out.println("\n\nПарні індекси:");
        for (int j = 0; j < arr.length; j += 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n\nЗворотній порядок:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}