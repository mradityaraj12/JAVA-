
class program1{
     public static void main(String[] args){
       int[] nums={10, 20, 25, 45, 15, 78, 85, 40, 50};
       acessEvenIndexElement(nums);
          

       
}
  public static void acessEvenIndexElement(int[] a){
         for(int i =0; i <a.length;i++)
            if(i%2==0){
              System.out.print(a[i] +" ");
      }

}  


}