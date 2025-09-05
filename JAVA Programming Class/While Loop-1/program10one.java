import java.util.Scanner;

public class program10one {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Sc.nextInt();
        int count = PrintAndCountFacter(n);
        System.out.println("\n Total Facter Are:" + count);
    }

    public static int PrintAndCountFacter(int n) {
        System.out.println(1 + " ");
        int count = 1;
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                int fact1 = i, fact2 = n / i;
                if (fact1 == fact2) {
                    count++;
                    System.out.println(fact1 + "'");

                } else {
                    count += 2;
                    System.out.println(fact1 + " " + fact2 + "");
                }

            }
            i++;
        }
        return count;

    }
}
