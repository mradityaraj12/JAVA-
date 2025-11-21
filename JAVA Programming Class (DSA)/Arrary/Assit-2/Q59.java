public class Q59 {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 8, 9, 10, 6, 10, 5, 8, 7, 8, 10 };
        UniqueElements(a);
    }

    public static void UniqueElements(int[] a) {
        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max)
                max = x;
            else if (x < min)
                min = x;

        }
        int[] freq = new int[max - min + 1];
        for (int x : a) {
            freq[x - min]++;

        }
        int maxFreq = 1, elements = a[0];
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                elements = i + min;
            }

        }

        System.out.println(elements + " has appeared maximum times: " + maxFreq);
    }

}
