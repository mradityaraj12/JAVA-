
/**
 * ! Enter the number of row and columns: 5 ?

A  
B  A  
C  B  A  
D  C  B  A  
E  D  C  B  A  

 */

import java.util.Scanner;

public class program32 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int num = i + 64;

            for (int j = 1; j <= star; j++)
                System.out.print((char) (num--) + "  ");
            star++;

            System.out.println();
        }
    }

}
