public class Q46 {

    public static void main(String[] args) {
        int[] a = { 80, 80, 43, 50, 38, 63, 58, 80 };
        int SecondSmallest = getSecondSmallest(a);

        System.out.println("The Second Smallest Element is: " + SecondSmallest);

    }

    public static int getSecondSmallest(int[] a) {
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int num : a) {
            if (num < min) {
                secondmin = min;
                min = num;
            } else if (num < secondmin && num != min) {
                secondmin = num;
            }
        }

        if (secondmin != Integer.MAX_VALUE)
            return secondmin;
        else
            return secondmin;

    }

}
