class program4{
    public static void main(String[] args){
           
         System.out.println("main Method Starts");
                test(1);
         System.out.println("main Method Ends");

       }
     
    public static void test(int n){
              if(n<=10){
                      test(n+1);
                     System.out.println(n);
         


           }
     }


}