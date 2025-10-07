
/**
 * ! Enter the number of Row :
5

A       B 
C D   E F
G H I J K
L M   N O
P       Q

 */

import java.util.Scanner;

public class Q211 {

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
        char c = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j <= Sstar || j >= Estar) {
                    System.out.print(c++ + " ");
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
