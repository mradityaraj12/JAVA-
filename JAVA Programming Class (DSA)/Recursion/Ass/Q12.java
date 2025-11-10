import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Is:");
        int n = sc.nextInt();

        int rev = Palidrome(n, 0);
        if (n == rev) {
            System.out.println(n + " is a Palidrome ");
        } else {
            System.out.println(n + " is not a Palidrome");
        }

    }

    public static int Palidrome(int n, int rev) {
        if (n == 0) {
            return rev;
        } else {
            rev = rev * 10 + n % 10;
            return Palidrome(n / 10, rev);
        }
    }

}
