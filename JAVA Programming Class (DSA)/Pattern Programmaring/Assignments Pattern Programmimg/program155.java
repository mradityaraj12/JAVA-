
/**
 * ! Enter the Number Of Row IS :
7
      1  
    3  2  1
  5  4  3  2  1
7  6  5  4  3  2  1
  5  4  3  2  1
    3  2  1
      1
      
 */

import java.util.Scanner;

public class program155 {

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

        int star = 1;
        int rowMid = n / 2 + 1;
        int space = n / 2;

        for (int i = 1; i <= n; i++) {
            int num = star;
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-3d", num--);
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
