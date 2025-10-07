
/**
 * ! Enter the Number Of Row IS ; 9 ? 

        * 
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        * 

 */

import java.util.Scanner;

public class program129 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS ;");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 1;
        int rowMid = n / 2 + 1;
        int space = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            if (i < rowMid) {

                star++;
                space--;
            } else {
                star--;
                space++;

            }

            System.out.println();

        }
    }

}
