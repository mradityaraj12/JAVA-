
/**
 * ! Enter The Number Is : 235 ? 

353

 */

import java.util.*;

class Q25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Is :");
        int n = sc.nextInt();
        String oct = ConvertDecimalNumbertoOctal(n);
        System.out.println(oct);

    }

    public static String ConvertDecimalNumbertoOctal(int n) {
        String oct = "";
        while (n > 0) {
            oct = n % 8 + oct;

            n /= 8;

        }
        return oct;
    }

}