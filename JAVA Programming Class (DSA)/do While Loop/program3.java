import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        char c;

        do {
            System.out.println("Enter the Number ");
            int n = Sc.nextInt();
            if (isPrimeNumber(n)) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is not a Prime Number");

            }
            System.out.println("Enter Y/y to Continue .....");
            c = Sc.next().charAt(0);

        } while (c == 'Y' || c == 'y');
        System.out.println("==================Program End ==============");
    }

    public static boolean isPrimeNumber(int n) {
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

            i += 2;
        }

        return true;
    }

}
