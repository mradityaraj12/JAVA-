import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Methods Starts:");
        System.out.println("Enter The Number To Print Table Is :");
        int n = sc.nextInt();
        PrintTable(n, 1);

        System.out.println("Main Methods Ends:");
    }

    public static void PrintTable(int n, int i) {
        if (i <= 10) {

            System.out.println(n + "*" + i + "=" + (n * i));
            PrintTable(n, i + 1);
        }
    }

}
