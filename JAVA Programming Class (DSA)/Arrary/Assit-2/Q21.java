import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("Element Before Insertion:");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("\n Enter the Index :");
        int index = sc.nextInt();
        System.out.println("Enter the Value :");
        int val = sc.nextInt();
        arr = insert(arr, index, val);
        System.out.println(" Element After insertion :");
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static int[] insert(int[] a, int index, int val) {
        if (index < 0 || index > a.length) {
            System.err.println("Element Can not be Inserted:");
            return a;
        }

        int[] b = new int[a.length + 1];
        b[index] = val;
        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = a[i];

            } else if (i > index) {
                b[i] = a[i - 1];
            }
        }

        return b;
    }

}
