import java.util.Scanner;

/**
   * ! WAJP to convert a decimal number into a hexadecimal number. ?

 */

import java.util.*;

public class Q27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number Is:");
        int n = sc.nextInt();

        String hex = ConvertDecimalToHexaDecimal(n);
        System.out.println(hex);

    }

    public static String ConvertDecimalToHexaDecimal(int n) {
        String hex = "";

        while (n > 0) {
            int rem = n % 16;
            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char) (rem + 55) + hex;
            }

            n /= 16;
        }

        return "HexaDecimal Value Is :" + hex;
    }

}
