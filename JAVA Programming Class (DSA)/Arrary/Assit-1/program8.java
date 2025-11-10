
class program8{
     public static void main(String[] args){
       int[] nums={10, 20, 25, 4, 15, 78, 85, 40, 50, 71, 9,80};
      PrintAndCountBiggerThanAverage(nums);
       
}
  public static void PrintAndCountBiggerThanAverage(int[] nums){
             int sum =0;
          
         for(int i =0; i <nums.length;i++)
           sum = sum+nums[i];
         double avg = sum/nums.length;
              System.out.println("Bigger Elements Than Average Value : " + avg);
                System.out.print("Elements Bigger Than average:");

           int count = 0;
                 for(int i = 0 ; i <nums.length; i++){
                    if(nums[i] > avg){
                      System.out.print(nums[i] + " " );
                          count++;
                    }
               }
           System.out.println("\n Total elements bigger than average:" + count);
              
   }
}