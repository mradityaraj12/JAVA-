public class Q61 {
    public static void main(String[] args) {
        int[] a = { 5, 6, 5, 6, 8, 8, 9, 10, 8, 5, 5, 5, 6, 10, 8, 8, 10 };
        int SmallestElement = SmallestFrequencyElement(a);
        System.out.println("The Return Smallest  Frequency of Element is:" + SmallestElement);

    }

    public static int SmallestFrequencyElement(int[] a) {

        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max)
                max = x;
            else if (x < min)
                min = x;

        }
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < a.length; i++) {
            freq[a[i] - min]++;
        }

        int element = a[0], maxFreq = 1;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                element = i + min;
            }

        }
        return element;
    }

}
