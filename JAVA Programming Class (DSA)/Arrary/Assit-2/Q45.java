public class Q45 {

    public static void main(String[] args) {
        int[] a = { 80, 80, 43, 50, 38, 63, 58, 80 };
        int secondBiggest = getSecondBiggest(a);

        System.out.println("The Second Biggest Element is: " + secondBiggest);

    }

    public static int getSecondBiggest(int[] a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;

    }

}
