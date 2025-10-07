
public class program11 {
    public static void main(String[] args) {
        int x = 12;
        int y = x++ + ++x;
        y++;
        int z = ++y;
        int p = x++ - ++y + z++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);

    }
}
