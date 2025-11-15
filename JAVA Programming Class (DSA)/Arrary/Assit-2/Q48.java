public class Q48 {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 8, 10, 10, 7, 8, 7, 6, 7, 5 };
        GenerateFrequency(a);
        // System.out.println("Frequency Generated Successfully");

    }

    public static void GenerateFrequency(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int nums : a) {
            if (nums > max) {
                max = nums;

            } else if (nums < min) {
                min = nums;
            }

        }

        int[] frequency = new int[max - min + 1];
        for (int nums : a) {
            frequency[nums - min]++;
        }

        System.out.println("Element\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((i + min) + " is  " + frequency[i] + "  times");
            }
        }
    }

}
