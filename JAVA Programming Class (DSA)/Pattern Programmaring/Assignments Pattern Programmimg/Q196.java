
/**
 * ! Enter the Number Of Row IS :

 7

 
A  A  A  A  A  A  A  
   B  B  B  B  B
      C  C  C
         D
      E  E  E
   F  F  F  F  F
G  G  G  G  G  G  G 

 */

import java.util.Scanner;

public class Q196 {

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

        for (int i = 1; i <= n; i++) {
            int num = i + 64;

            for (int j = 1; j <= space; j++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf((char) num + "  ");
            if (i < rowMid) {

                star -= 2;
                space++;

            } else {
                star += 2;
                space--;

            }

            System.out.println();

        }
    }

}
