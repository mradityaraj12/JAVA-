
/**
 * ! Enter the number of Row :
7


A           A 
B B       B B
C C C   C C C
D D D D D D D
E E E   E E E
F F       F F
G           G

 */

import java.util.Scanner;

public class Q209 {

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
            int num = i + 64;
            for (int j = 1; j <= n; j++) {
                if (j <= Sstar || j >= Estar) {
                    System.out.print((char) num + " ");
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
