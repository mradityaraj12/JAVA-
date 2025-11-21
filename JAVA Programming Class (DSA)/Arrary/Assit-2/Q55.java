
public class Q55 {

    public static void main(String[] args) {
        int[] a = { 8, 5, 7, 8, 8, 5, 10, 8, 10, 6, 6 };
        int Freq = onceinTheArray(a);
        System.out.println("Only One elements Has Appeared once in The Areay: " + Freq);

    }

    public static int onceinTheArray(int[] a) {
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
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1)
                return i + min;

        }
        return -1;

    }
}
