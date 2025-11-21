import java.util.Scanner;

public class Q39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Prime Number is:");
        int n = sc.nextInt();

        System.out.println("First" + n + "Prime Number");
        for (int p : primes)
            System.out.println(p);

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

    public static int[] StoreNPrimeNumber(int[] n) {
        int[] primes = new int[n];
        int index = 0;

        for (int i = 2;; i++) {
            if (isPrime(i)) {

                primes[index++] = i;

            }
        }
        return primes;

    }

}
