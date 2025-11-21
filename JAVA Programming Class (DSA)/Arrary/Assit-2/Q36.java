
public class Q36 {
    public static void main(String[] args) {
        int[] a = { 5, 10, 11, 15, 17, 20, 23, 24, 29, 30 };
        printAndCountPrime(a);

    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0)
            return false;

        int i = 3;
        while (i * i <= n) {
            if (n % i == 0)
                return false;
            i++;

        }

        return true;

    }

    public static void printAndCountPrime(int[] a) {
        int count = 0;
        System.out.println("Prime Number in Array is : ");
        for (int x : a) {
            if (isPrime(x)) {
                System.out.print(x + " ");
                count++;
            }
        }

        System.out.println("\n Total Prime Number is :" + count);
    }

}
