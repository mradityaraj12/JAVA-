public class Q17 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println("The Original Array is:");
        Display(arr);

        HalfReversed(arr);

        System.out.println("\n the Reversed Array Are:");
        Display(arr);

    }

    public static void HalfReversed(int[] a) {
        int length = a.length - 1;

        Reverser(a, 0, length / 2);
        Reverser(a, (length / 2) + 1, a.length - 1);
    }

    public static void Reverser(int[] a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;

        }
    }

    public static void Display(int[] a) {
        for (int nums : a) {
            System.out.print(nums + "  ");
        }

    }

}
