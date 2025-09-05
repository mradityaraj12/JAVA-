
// public class program14 {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 6;
//         int c = 10;
//         String result = ((a + b > c) && (a + c > b) && (b + c > a)) ? "the given side from a valid tringhle"
//                 : "the given side id not valide tringle";
//         System.out.println(result);
//     }
// }

public class program14 {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;
        int c = 80;
        String result = ((a + b > c) && (a + c > b) && (b + c > a)) ? "the given side from a valid tringhle"
                : "the given side is not valide tringle";
        System.out.println(result);
    }
}