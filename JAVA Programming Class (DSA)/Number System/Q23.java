
/**
 * ! WAJP to convert a decimal number into binary number.
Eg:
i/p: 28
o/p: 11100

 * ! Enter The Number Is : 28 ? 

11100

 */

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Is :");
        int n = sc.nextInt();
        String bin = ConvertDecimalNumbertoBinary(n);
        System.out.println(bin);

    }

    public static String ConvertDecimalNumbertoBinary(int n) {
        String bin = "";
        while (n > 0) {
            bin = n % 2 + bin;

            n /= 2;

        }
        return bin;
    }

}
