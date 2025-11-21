public class Q37 {

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
        int sum = 0;
        System.out.println("Prime Number in Array is : ");
        for (int x : a) {
            if (isPrime(x)) {
                sum = sum + x;
            }
        }

        System.out.println("\n Total sum of  Prime Number is :" + sum);
    }

}
