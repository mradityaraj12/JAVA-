
/**
 * ! Enter the number of Row :
7
31 30 29 28 27 26 25 
   24 23 22 21 20
      19 18 17
         16
      15 14 13
   12 11 10 9  8
7  6  5  4  3  2  1

 */

import java.util.Scanner;

public class Q187 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of Row :");
        int n = Sc.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n) {
        int star = n;
        int space = 0;
        int mid = n / 2 + 1;
        int num = n * n / 2 + n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++) {
                System.out.printf("%-3d", num--);
            }
            if (i < mid) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
            System.out.println();
        }

    }

}
