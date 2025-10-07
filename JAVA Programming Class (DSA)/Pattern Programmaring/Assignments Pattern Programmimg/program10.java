
/**
 * !   Enter the number of row And columun : 15 ?
  
 

* * * * * * * * * * * * * * * 
*             *           * * 
*             *         *   * 
*             *       *     * 
*             *     *       * 
*             *   *         * 
*             * *           * 
* * * * * * * * * * * * * * * 
*           * *             * 
*         *   *             * 
*       *     *             *
*     *       *             *
*   *         *             *
* *           *             *
* * * * * * * * * * * * * * *
**
**
**
**
**
**
**
**
**
**
**
**
**
**
**


 */

import java.util.Scanner;

public class program10 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row And columun");
        int n = Sc.nextInt();
        getPrintPattern(n);
    }

    public static void getPrintPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("Pattern is not Possible for Even Row :");
            return;
        }
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid || i == 1 || i == n || j == 1 || j == n || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("**");
        }
    }

}
