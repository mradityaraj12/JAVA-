public class Q23 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 3;
        System.out.println("The Original Array is:");
        Display(arr);

        RotatedRight(arr, k);

        System.out.println("\n the Rotated Array Are:");
        Display(arr);

    }

    public static void RotatedRight(int[] a, int k) {

        k = k % a.length;

        Reversed(a, 0, a.length - 1);
        Reversed(a, 0, k - 1);
        Reversed(a, k, a.length - 1);

    }

    public static void Reversed(int[] a, int start, int end) {
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
