
/**
 * ! Enter the Number of Row Is :  5 

A  A  A  A  A  
  B  B  B  B
    C  C  C
      D  D
        E 

 */

import java.util.Scanner;

public class program101 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row Is : ");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int star = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {
            int num = i + 64;
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print((char) num + "  ");
            star--;
            space++;
            System.out.println();
        }
    }

}
