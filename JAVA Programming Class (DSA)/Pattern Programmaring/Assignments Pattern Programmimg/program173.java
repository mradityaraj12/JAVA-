
/**
 * ! Enter the Number Of Row IS : 7 ? 

      A 
    B B B
  C C C C C
D D D D D D D
  E E E E E
    F F F
      G 

 */

import java.util.Scanner;

public class program173 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 1;
        int rowMid = n / 2 + 1;
        int space = n / 2;

        for (int i = 1; i <= n; i++) {
            int num = i + 64;
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print((char) num + " ");
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
