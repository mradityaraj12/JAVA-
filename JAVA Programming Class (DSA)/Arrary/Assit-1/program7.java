
class program7{
     public static void main(String[] args){
       int[] nums={10, 20, 25, 4, 15, 78, 85, 40, 50, 71, 9,80};
      PrintAndCount(nums);
       
}
  public static void PrintAndCount(int[] nums){
             double sum =0;
          
         for(int i =0; i <nums.length;i++)
           sum = sum+nums[i];
         double avg = sum/nums.length;
              System.out.println("Bigger Elements Than Average Value : " + avg);
           int count = 0;
                 for(int x : nums){
                    if(x>avg){
                      System.out.print(x + " " );
                          count++;
                    }
               }
           System.out.println("\n Total Such Number are:" + count);
              
   }
}