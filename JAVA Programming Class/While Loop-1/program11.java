import java.util.*;

public class program11 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The number is:");
        int n = Sc.nextInt();
        PrintPrime(n);
    }

    public static void PrintPrime(int n) {
        if (n < 2) {
            System.out.println(n + "is Not prime Number");

            return;
        }
        int count = 0;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                int fact1 = i, fact2 = n / i;
                if (fact1 == fact2) {
                    count++;

                } else
                    count += 2;

            }
            i++;
        }
        if (count == 0) {
            System.out.println(n + " is a Prime Number");

        } else
            System.out.println(n + "Is not a Prime Number ");

    }
}
