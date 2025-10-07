
/**
 * ! Enter the number of Row :
7


1                 2  
3  4           5  6
7  8  9     10 11 12
13 14 15 16 17 18 19
20 21 22    23 24 25 
26 27          28 29
30                31 


 */

import java.util.Scanner;

public class Q207 {

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
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j <= Sstar || j >= Estar) {
                    System.out.printf("%-3d", num++);
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
