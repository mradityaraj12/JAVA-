public class Q33 {
    public static void main(String[] args) {
        int[] a = { 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0 };
        ShiftZeroOne(a);

    }

    public static void ShiftZeroOne(int[] a) {
        int countzero = 0;
        for (int x : a) {
            if (x == 0)
                countzero++;
        }
        for (int i = 0; i < a.length; i++) {
            if (i < countzero)
                a[i] = 0;
            else
                a[i] = 1;

        }
    }

}
