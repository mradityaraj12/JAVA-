
/**
 * ! Enter the Number Of Row IS : 7 ?

      4  
    3  3  3
  2  2  2  2  2
1  1  1  1  1  1  1
  2  2  2  2  2
    3  3  3
      4  

 */

import java.util.Scanner;

public class program158 {

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
        int num = n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print(num + "  ");
            if (i < rowMid) {

                star += 2;
                space--;
                num--;
            } else {
                star -= 2;
                space++;
                num++;

            }

            System.out.println();

        }
    }

}
