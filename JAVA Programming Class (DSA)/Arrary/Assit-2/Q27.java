public class Q27 {
    public static void main(String[] args) {
        int[] a = { 7, 5, 4, 0, 3, 1, 6 };
        int Missing = MissingElement(a);
        System.out.println("Missing Element are :" + Missing);

    }

    public static int MissingElement(int[] a) {
        int sum = 0;
        for (int x : a)
            sum = sum + x;

        int n = a.length;

        return n * (n + 1) / 2 - sum;
    }

}
