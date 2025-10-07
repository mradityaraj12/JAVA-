import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.println("Enter numbers (enter 0 or negative number to stop):");

        do {
            System.out.println("Enter the Number: ");
            num = sc.nextInt(); // take input

            if (num > 0) { // add only positive numbers
                sum += num;
            }

        } while (num > 0); // continue until number is positive

        System.out.println("Sum of all positive numbers = " + sum);

    }
}
