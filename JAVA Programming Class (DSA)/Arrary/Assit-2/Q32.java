public class Q32 {
    public static void main(String[] args) {
        int[] a = { 7, 2, 0, 5, 0, 0, 4, 5, 6, 2, 0 };
        MoveZero(a);

    }

    public static void MoveZero(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (i != j) {
                    a[j] = a[i];
                    a[i] = 0;
                }
                j++;
            }
        }

    }

}
