public class Q25 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println("The Original Array is:");
        Display(arr);

        RotatedToLeft(arr);

        System.out.println("\n the Rotated Array Are:");
        Display(arr);

    }

    public static void RotatedToLeft(int[] a) {

        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];

        }
        a[a.length - 1] = temp;

    }

    public static void Display(int[] a) {
        for (int nums : a) {
            System.out.print(nums + "  ");
        }

    }

}
