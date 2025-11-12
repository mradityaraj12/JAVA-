public class Q10 {

    public static void main(String[] args) {
        int[] a = { 2, 5, 4, 3, 6 };

        System.out.println("The Resultant Array Is:");
        ChangeValues(a);

    }

    public static void ChangeValues(int[] a) {
        int product = 1;
        for (int x : a) {
            product = product * x;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = product / a[i];
            System.out.print(a[i] + "  ");
        }

    }

}
