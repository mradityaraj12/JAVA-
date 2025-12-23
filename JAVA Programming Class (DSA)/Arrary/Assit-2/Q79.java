public class Q79 {
    public static void main(String[] args) {
        int[] a = { 20, 18, 1, 10, 2, 4, 8, 9, 21 };
        System.out.println("Befor SelectionSorting Are:");
        for (int x : a)
            System.out.print(x + " ");
        SelectionSort(a);
        System.out.println("\n After Selection Sorting Are:");
        for (int x : a)
            System.out.print(x + " ");
    }

    public static void SelectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = a[i], minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;

                }
            }

            a[minIndex] = a[i];
            a[i] = min;
        }
    }

}
