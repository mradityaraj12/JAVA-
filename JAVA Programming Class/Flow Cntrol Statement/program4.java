//WAJP to take a character input and print itis upper case, lower case or other alphabet using if else statement.

public class program4 {
    public static void main(String[] args) {
        char ch = 10;

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "is a Upper Alphabet");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "is a Lower Alphabet");
        } else {
            System.out.println("this is not alphabet");
        }
    }
}
