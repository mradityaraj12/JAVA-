public class Q15 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };

        System.out.println("The Original Array Is :");
        ChangeValue(arr);

        int index1 = 1;
        int index2 = 4;

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("\n Swapped Array Are:");
        ChangeValue(arr);

    }

    public static void ChangeValue(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
