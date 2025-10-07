class program1{
    public static void main(String[] args){
           
         System.out.println("main Method Starts");
                test();
         System.out.println("main Method Ends");

       }
     
    public static void test(){
         System.out.println("This Is test Method : ");
          test();


    }
     


}