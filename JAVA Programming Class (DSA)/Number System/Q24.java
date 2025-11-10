
/**
 * ! WAJP to convert a binary number into decimal number.

    i/p: 101101
     o/p: 45

     * !Enter The Number Is : 101101 ?
     * 

Decimal Value is:45

 */

import java.util.*;

public class Q24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Is :");
        int n = sc.nextInt();
        String dec = ConvertBinaryNumberToDecimal(n);
        System.out.println(dec);

    }

    public static String ConvertBinaryNumberToDecimal(int n) {
        int dec = 0;
        int twoMul = 1;

        while (n > 0) {
            int rem = n % 10;
            if (rem > 1) {
                return "Invalid Input ! Binary Has Range 0 to 1";

            }
            dec = dec + twoMul * rem;

            n /= 10;
            twoMul *= 2;
        }
        return "Decimal Value is:" + dec;
    }

}
