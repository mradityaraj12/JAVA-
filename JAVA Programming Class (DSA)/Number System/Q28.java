
/**
 *  ! WAJP to convert a hexadecimal number into a decimal number. ?

 * 
 * ! Enter the HexaDecimal Number Is : 3f2 ? 

Decimal Value is 1010

 */

import java.util.Scanner;

public class Q28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the HexaDecimal Number Is :");
        String S = sc.nextLine();
        String dec = ConvertHexaDecimalToDecimal(S);
        System.out.println(dec);
    }

    public static String ConvertHexaDecimalToDecimal(String S) {
        int dec = 0;
        int SixteenMul = 1;
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c >= 48 && c <= 57)

                dec = dec + SixteenMul * (c - 48);

            else if (c >= 'A' && c <= 'F')
                dec = dec + SixteenMul * (c - 55);

            else if (c >= 'a' && c <= 'f')

                dec = dec + SixteenMul * (c - 87);

            else

                return " Invalid Hex Number it Should be in Range 0-F";

            SixteenMul *= 16;

        }

        return "Decimal Value is " + dec;
    }

}
