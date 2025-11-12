public class Q22 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println("The Original Array is:");
        Display(arr);

        RotatedToRight(arr);

        System.out.println("\n the Rotated Array Are:");
        Display(arr);

    }

    public static void RotatedToRight(int[] a) {

        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];

        }
        a[0] = temp;

    }

    public static void Display(int[] a) {
        for (int nums : a) {
            System.out.print(nums + "  ");
        }

    }

}
