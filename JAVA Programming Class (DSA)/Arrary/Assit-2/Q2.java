
class Q2{
     public static void main(String[] args){
            int a = 10 , b = 20;
          System.out.println("Before call By Values:a = " + a + ", b = " + b);
               callValues(a , b);
        
         System.out.println("After call By Values:a = " + a + ", b = " + b);

        System.out.println("=======================================");
        
            int[] nums = {10, 20, 30, 40, 50 };

          System.out.println("Before call By Referance (Array)");
               displayValues(nums);
        
           callByReferance(nums);
           
         System.out.println("After call By Referance (Array)");
           displayValues(nums);        
  }

    public static void callValues(int x , int y){
         x =x+10;
         y =y+20;
            
        System.out.println("Inside callByValues: x =" + x + ", y = "+y );
    }  
    
   public static void callByReferance(int[] nums){
             for(int i = 0; i < nums.length; i++){
                 nums[i] = nums[i] +5;
           }
    System.out.println("Inside CallByReferance (Array Values Modifited)");
  }

  public static void displayValues(int[] nums){
             for(int x:nums){
                 System.out.print(x +" ");
                     System.out.println();
              }

      }

}