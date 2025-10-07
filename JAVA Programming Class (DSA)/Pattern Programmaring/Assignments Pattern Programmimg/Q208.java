
/**
 * ! Enter the number of Row :
7


31                30 
29 28          27 26
25 24 23    22 21 20
19 18 17 16 15 14 13
12 11 10    9  8  7
6  5           4  3
2                 1 

 */

import java.util.Scanner;

public class Q208 {

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
        int num = n * n / 2 + 7;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j <= Sstar || j >= Estar) {
                    System.out.printf("%-3d", num--);
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
