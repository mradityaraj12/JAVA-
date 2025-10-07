
/**
 * ! Enter the Number Of Row IS :
7
      25  
    24  23  22
  21  20  19  18  17
16  15  14  13  12  11  10
  9  8  7  6  5
    4  3  2
      1
      
 */

import java.util.Scanner;

public class program153 {

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
        int num = n * n / 2 + 1;
        for (int i = 1; i <= n; i++) {
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
