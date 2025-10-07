
/**
 * ! Enter the number of Row :
7


A           A 
A B       B A
A B C   C B A
A B C D C B A
A B C   C B A
A B       B A
A           A


 */

import java.util.Scanner;

public class Q214 {

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

            for (int j = 1; j <= n; j++) {

                if (j <= Sstar || j >= Estar) {
                    int num = j <= Sstar ? j + 64 : (n - j + 64 + 1);
                    System.out.printf((char) num + " ");
                } else {
                    System.out.print("  ");
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
