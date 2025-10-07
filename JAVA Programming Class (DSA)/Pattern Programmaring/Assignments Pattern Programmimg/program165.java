
/**
 * ! Enter the Row IS :
7
         1  
      1  1  2
   3  4  1  5  6
1  1  1  1  1  1  1
   7  8  1  9  10
      11 1  12
         1
         
 */

import java.util.Scanner;

public class program165 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Row IS :");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        if (n % 2 == 0) {
            System.out.println("Pattern is not prossible for Even Row:");
            return;
        }
        int star = 1;
        int space = n / 2;
        int rowMind = n / 2 + 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("   ");

            int colMid = star / 2 + 1;
            for (int j = 1; j <= star; j++) {
                if (j == colMid || i == rowMind) {
                    System.out.printf("%-3d", 1);
                } else {
                    System.out.printf("%-3d", num++);
                }
            }
            if (i < rowMind) {
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
