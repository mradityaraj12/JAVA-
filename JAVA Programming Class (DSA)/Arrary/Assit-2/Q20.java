import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("Element Before Insertion:");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("\n Enter the Index :");
        int index = sc.nextInt();
        arr = remove(arr, index);
        System.out.println(" Element After Remove :");
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static int[] remove(int[] a, int index) {
        if (index < 0 || index >= a.length) {
            System.err.println("Element Can not be Removed");
            return a;
        }

        int[] b = new int[a.length - 1];
        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = a[i];

            } else {
                b[i] = a[i + 1];
            }
        }

        return b;
    }

}
