
/**
 * ! WAJP to convert an octal number into decimal number. ?
 * 
 * 
 * ! Enter The Decimal Value Is : 353 ?

Octal Value is:235
 
 */

import java.util.*;

public class Q26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Value Is :");
        int n = sc.nextInt();
        String oct = ConvertBinaryNumberToDecimal(n);
        System.out.println(oct);

    }

    public static String ConvertBinaryNumberToDecimal(int n) {
        int oct = 0;
        int twoMul = 1;

        while (n > 0) {
            int rem = n % 10;

            oct = oct + twoMul * rem;

            twoMul *= 8;
            n /= 10;
        }
        return "Octal Value is:" + oct;
    }

}
