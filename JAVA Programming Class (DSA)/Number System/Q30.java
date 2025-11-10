
/**
 * ! WAJP to calculate combination or total number of ways of selecting r things at a time from n things. ?

                 nCr = n! /  r! ∗ n − r ! 

 * 
 * !  Enter n Is : 15 

 * !  Enter r: 11 

         Combination  is : 1365
 */

import java.util.Scanner;

public class Q30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Is :");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        int comb = getCombination(n, r);
        System.out.println("Combination  is : " + comb);
    }

    public static int getCombination(int n, int r) {

        if (r > n) {
            System.out.println("Selection  is  not Possible:");
            return 0;

        }
        int comb = 1;

        for (int i = 0; i < r; i++)
            comb = comb * (n - i) / (i + 1);

        return comb;
    }

}
