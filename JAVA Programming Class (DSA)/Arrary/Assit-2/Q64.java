import java.util.NoSuchElementException;

public class Q64 {
    public static void main(String[] args) {
        int[] a = { 3, 3, 4, 2, 4, 4, 2, 4, 4, 4, 4 };
        try {
            int Majority = printMajorityElelment(a);
            System.out.println("Majority Element is :" + Majority);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static int printMajorityElelment(int[] a) {
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
            if (freq[i] > a.length / 2) {
                return i + min;
            }
        }

        throw new NoSuchElementException("Elelment is Not Avilable:");
    }

}
