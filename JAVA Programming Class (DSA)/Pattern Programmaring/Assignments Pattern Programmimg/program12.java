
/**
 * ! Enter the number of rows and columns: 7

(1 ,1 )(1 ,2 )(1 ,3 )(1 ,4 )(1 ,5 )(1 ,6 )(1 ,7 )
(2 ,1 )(2 ,2 )(2 ,3 )(2 ,4 )(2 ,5 )(2 ,6 )(2 ,7 )
(3 ,1 )(3 ,2 )(3 ,3 )(3 ,4 )(3 ,5 )(3 ,6 )(3 ,7 )
(4 ,1 )(4 ,2 )(4 ,3 )(4 ,4 )(4 ,5 )(4 ,6 )(4 ,7 )
(5 ,1 )(5 ,2 )(5 ,3 )(5 ,4 )(5 ,5 )(5 ,6 )(5 ,7 )
(6 ,1 )(6 ,2 )(6 ,3 )(6 ,4 )(6 ,5 )(6 ,6 )(6 ,7 )
(7 ,1 )(7 ,2 )(7 ,3 )(7 ,4 )(7 ,5 )(7 ,6 )(7 ,7 )

 */

import java.util.*;

public class program12 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + " ," + j + " )");
            }

            System.out.println();
        }
    }

}
