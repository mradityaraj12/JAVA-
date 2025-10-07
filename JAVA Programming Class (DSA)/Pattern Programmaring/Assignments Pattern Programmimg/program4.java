
/**
 * ! Enter the number of rows and columns: 6

1 0 1 0 1 0 
1 0 1 0 1 0 
1 0 1 0 1 0 
1 0 1 0 1 0 
1 0 1 0 1 0 
1 0 1 0 1 0 

 */

import java.util.*;

public class program4 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j % 2 + " ");
            }

            System.out.println();
        }
    }

}
