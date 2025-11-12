public class Q16 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println("The Original Array is:");
        Display(arr);

        Reverser(arr);

        System.out.println("\n the Reversed Array Are:");
        Display(arr);

    }

    public static void Reverser(int[] a) {
        int start = 0;
        int end = a.length - 1;
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
