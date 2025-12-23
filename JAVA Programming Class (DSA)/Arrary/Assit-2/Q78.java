public class Q78 {
    public static void main(String[] args) {
        int[] a = { 10, 5, 4, 8, 18, 20, 9, 6, 3, 2, 1 };

        System.out.println("Befor BubbleSort are:");
        for (int x : a)
            System.out.print(x + " ");
        BubbleSort(a);
        System.out.println("\n After BubbleSorting Are:");
        for (int x : a)
            System.out.print(x + " ");

    }

    public static void BubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
            }

            if (flag)
                break;
        }
    }

}
