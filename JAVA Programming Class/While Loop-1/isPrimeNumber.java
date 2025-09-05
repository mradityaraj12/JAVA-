import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Number Is:");
        int n = Sc.nextInt();
        if (isPrime(n))
            System.out.println(n + "  Is a Prime Number");
        else
            System.out.println(n + "  IS not A primre Number");

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

}