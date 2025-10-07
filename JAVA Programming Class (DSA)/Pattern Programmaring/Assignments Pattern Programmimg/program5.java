
/**
 * ! Enter the number of rows and columns: 5

* * * * * 
*       *
*       *
*       *
* * * * *

 */

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

}
