
public class program4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 7;
        int result = (x < y) ? (y < z ? z : y) : x;
        System.out.println(result);
    }
}
