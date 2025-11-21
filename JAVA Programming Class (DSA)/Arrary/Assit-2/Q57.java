public class Q57 {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 8, 9, 10, 6, 10, 5, 8, 7, 8, 10 };
        EvenElements(a);
    }

    public static void EvenElements(int[] a) {
        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }

        int[] freq = new int[max - min + 1];
        for (int x : a) {
            freq[x - min]++;

        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 == 0)
                System.out.print((i + min) + " ");
        }
    }

}
