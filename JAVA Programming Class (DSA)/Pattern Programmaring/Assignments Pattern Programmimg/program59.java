
/** 
 * ! Enter the number of row and columns: 5 ?

        5    
      5    4    
    5    4    3    
  5    4    3    2    
5    4    3    2    1 

 */

import java.util.Scanner;

public class program59 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;

        for (int i = 1; i <= n; i++) {
            int num = n;
            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)

                System.out.print(num-- + "    ");

            star++;
            space--;

            System.out.println();
        }
    }

}
