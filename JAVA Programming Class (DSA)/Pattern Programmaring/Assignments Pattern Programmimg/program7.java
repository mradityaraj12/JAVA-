
/**
 * ! Enter the number of row And columun: 11 .
 

*                   * 
  *               *   
    *           *     
      *       *       
        *   *
          *
        *   *
      *       *       
    *           *     
  *               *   
*                   * 

 */

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row And columun");
        int n = Sc.nextInt();
        getPrintPattern(n);
    }

    public static void getPrintPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }
    }

}
