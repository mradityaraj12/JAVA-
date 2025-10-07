// WAJP to print all are equal if all havesame value or print biggest of threenumbers using if else statement.

public class program2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 9;

        if (a == b && a == c) {
            System.out.println("All are same with Value :" + a);
        } else if (a > b && a > c) {
            System.out.println(a + "is biggest");
        } else if (b > c) {
            System.out.println(c + "is Biggest");
        } else {
            System.out.println(c + " is Biggest");
        }
    }

}
