
class program5 {
  public static void main(String[] args) {
    int[] nums = { 10, 20, 25, 450, 15, 78, 858, 40, 500, 1000, 999, 800 };
    PrintThreeDigitNumber(nums);

  }

  public static void PrintThreeDigitNumber(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++)
      if (nums[i] >= 100 && nums[i] <= 999) {
        System.out.print(nums[i] + " ");
        count++;

      }
    System.out.println("\n Total All Three Digit Number Are :" + count);

  }

}