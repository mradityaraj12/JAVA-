public class Q26 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 2;
        System.out.println("The Original Array is:");
        Display(arr);

        RotatedToLeft(arr, k);

        System.out.println("\n the Rotated Array Are:");
        Display(arr);

    }

    public static void RotatedToLeft(int[] a, int k) {

        k = k % a.length;

        Reversed(a, 0, a.length - 1);
        Reversed(a, 0, a.length - 1 - k);
        Reversed(a, a.length - k, a.length - 1);

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
