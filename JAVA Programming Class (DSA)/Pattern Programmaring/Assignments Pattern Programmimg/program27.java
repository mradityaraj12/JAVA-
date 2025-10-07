/*
 * !  Enter the number of row and columns: 5

A  
B  C  
D  E  F  
G  H  I  J  
K  L  M  N  O  

 */

import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        // char c = 'A';
        // OR
        int num = 65;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star; j++)
                System.out.print((char) (num++) + "  ");
            star++;
            System.out.println();
        }
    }

}
