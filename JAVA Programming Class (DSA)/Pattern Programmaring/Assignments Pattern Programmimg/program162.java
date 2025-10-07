
/**
 * ! Enter the Row Is: 7 ? 

         1  
      1  1  2
   3  4  1  5  6
7  8  9  1  10 11 12
   13 14 1  15 16
      17 1  18
         1 

 */

import java.util.Scanner;

public class program162 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Row Is:");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("Pattern is Not Possible For Even Row");
            return;
        }
        int star = 1;
        int space = n / 2;
        int rowMid = n / 2 + 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("   ");
            int colMoid = star / 2 + 1;
            for (int j = 1; j <= star; j++) {
                if (j == colMoid) {
                    System.out.printf("%-3d", 1);
                } else {
                    System.out.printf("%-3d", num++);

                }
            }
            if (i < rowMid) {

                star += 2;
                space--;
            } else {
                star -= 2;
                space++;

            }

            System.out.println();

        }
    }

}
