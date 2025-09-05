class program2
{
          
        public static void test(){

              System.out.println("This is test method");
              System.out.println("test method ends");
             }
          
            public static void main(String[] args){

                System.out.println("This is main method");
                  
                  getPower();
                  System.out.println(" main method ends!:");

           }
       
         public static void getPower(){

              System.out.println("this is getPower method");
               test();
              System.out.println("getPower method ends");

        }
    

}
