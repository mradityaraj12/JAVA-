
/**
 * ! Eneter the number of Row Is : 5 

O  N  M  L  K  
 J  I  H  G
  F  E  D
   C  B
    A

 */

import java.util.Scanner;

public class program104 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Eneter the number of Row Is :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = n;
        int space = 0;
        int num = n * (n + 1) / 2 + 64;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int j = 1; j <= star; j++)
                System.out.print((char) (num--) + "  ");
            star--;
            space++;
            System.out.println();
        }
    }

}
