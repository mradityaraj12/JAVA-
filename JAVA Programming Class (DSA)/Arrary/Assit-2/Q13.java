public class Q13 {

    public static void main(String[] args) {
        int[] a = { 6, 1, 1, 1, 7, 7, 1, 1, 1, 1 };
        int maxCount = 0;
        int CurrentCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                CurrentCount++;

                if (CurrentCount > maxCount)
                    maxCount = CurrentCount;

            } else {
                CurrentCount = 0;

            }

        }

        System.out.println("Maximu Consecutive Is Are:" + maxCount);
    }
}
