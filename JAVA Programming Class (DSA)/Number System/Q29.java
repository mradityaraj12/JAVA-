import java.util.Scanner;

/**
 * ! WAJP to calculate permutation or total number of ways of arrangements of n
 * things taken r at a time.?
 * nPr =n!/n − r !
 * 
 * ! Enter n Is : 20

 * !  Enter r: 3 

          Permutation is : 6840
 * 
 */
import java.util.*;

public class Q29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Is :");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        int perm = getPermutation(n, r);
        System.out.println("Permutation is : " + perm);
    }

    public static int getPermutation(int n, int r) {

        if (r > n) {
            System.out.println("Arragement Are not Possible:");
            return 0;

        }
        int perm = 1;

        for (int i = 0; i < r; i++)
            perm = perm * (n - i);

        return perm;
    }

}
