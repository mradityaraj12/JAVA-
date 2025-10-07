
/**
 * ! Enter the number of row and columns:
5
            1  
         1  1  2  
      3  4  1  5  6  
   7  8  9  1  10 11 12 
13 14 15 16 1  17 18 19 20 

 */

import java.util.Scanner;

public class program84 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("   ");

            int colMid = star / 2 + 1;

            for (int j = 1; j <= star; j++) {
                if (j == colMid)
                    System.out.printf("%-3d", 1);
                else
                    System.out.printf("%-3d", num++);
            }
            star += 2;
            space--;
            System.out.println();
        }

    }

}
