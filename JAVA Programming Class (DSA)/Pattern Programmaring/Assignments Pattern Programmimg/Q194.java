
/**
 * ! Enter the Number Of Row IS :
7




7  7  7  7  7  7  7  
   6  6  6  6  6
      5  5  5
         4
      3  3  3
   2  2  2  2  2
1  1  1  1  1  1  1 

 */

import java.util.Scanner;

public class Q194 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {

        if (n % 2 == 0) {
            System.out.println("Pattern is NOT Possible for Even Row!");
            return;
        }

        int star = n;
        int rowMid = n / 2 + 1;
        int space = 0;
        int num = n;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-3d", num);
            if (i < rowMid) {

                star -= 2;
                space++;

            } else {
                star += 2;
                space--;

            }
            num--;

            System.out.println();

        }
    }

}
