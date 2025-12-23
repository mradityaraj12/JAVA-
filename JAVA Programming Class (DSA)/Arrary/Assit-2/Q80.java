public class Q80 {

    public static void main(String[] args) {
        int[] a = { 20, 18, 1, 10, 2, 4, 8, 9, 21 };
        System.out.println("Befor InsertionSorting Are:");
        for (int x : a)
            System.out.print(x + " ");
        insertionSort(a);
        System.out.println("\n After Insertion Sorting Are:");
        for (int x : a)
            System.out.print(x + " ");
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];

                j--;
            }
            a[j + 1] = key;

        }

    }

}
