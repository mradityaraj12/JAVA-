import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter The 1st  Number :");
        int a = sc.nextInt();
        System.out.println("enter The 2nd  Number :");
        int b = sc.nextInt();

        int hcf = getHCF(a, b);
        System.out.println("HCF of Number is:" + hcf);

    }

    public static int getHCF(int a, int b) {
        if (b == 0)
            return a;

        return getHCF(b, a % b);
    }

}
