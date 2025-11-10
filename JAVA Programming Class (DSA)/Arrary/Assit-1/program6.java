
class program6{
     public static void main(String[] args){
       int[] nums={10, 20, 25, 45, 15, 78, 85, 40, 50, 71, 9,80};
       int sum = getSum(nums);
         System.out.println("Sum is :" + sum);
          

       
}
  public static int getSum(int[] nums){
             int sum=0;
          
         for(int i =0; i <nums.length;i++){
           sum = sum+nums[i];
              
             
}  
         
return sum; 

}
}	