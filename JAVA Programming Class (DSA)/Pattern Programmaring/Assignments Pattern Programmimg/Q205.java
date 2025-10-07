import java.util.Scanner;

public class Q205 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of Row :");
        int n = Sc.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n) {
        int Sstar = 1;
        int Estar = n;
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            int numleft = 1;
            int numright = 1;
            for (int j = 1; j <= n; j++) {
                if (j <= Sstar || j >= Estar) {
                    if (j <= Sstar) {
                        System.out.print(numleft + "  ");
                        numleft++;
                    } else {
                        System.out.print(numright + "  ");
                        numright++;
                    }

                } else {
                    System.out.print("   ");
                }
            }
            if (i < mid) {
                Sstar++;
                Estar--;
            } else {
                Sstar--;
                Estar++;
            }
            System.out.println();
        }
    }

}
