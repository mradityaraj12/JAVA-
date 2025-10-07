import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("Enter the Number:");

            int n = Sc.nextInt();
            // int sum = getFactorial(n);
            // System.out.println(sum);

            getFactorial(n);

            System.out.println("Enter Y/y to Continue.....");

            c = Sc.next().charAt(0);
        } while (c == 'Y' || c == 'y');

        System.out.println("============Program End====");

    }

    public static int getFactroialSum(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;

            i++;
        }
        return fact;
    }

    public static void getFactorial(int n) {
        // int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            // sum = sum + getFactroialSum(rem);
            System.out.println(rem + "!" + getFactroialSum(rem));

            n /= 10;
        }
        // return sum;

    }

}
