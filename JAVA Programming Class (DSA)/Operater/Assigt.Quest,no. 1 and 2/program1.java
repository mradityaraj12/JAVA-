// Operater Based Programming.

class program1{
   public static void main(String[] args){
      int n= 5783;
     //you want last digit 
                     //  so take mod with 10
    //Ques.no.1

      System.out.println(n%10);
      System.out.println(n%100);
      System.out.println(5783/10);
      System.out.println(5783/100);
      System.out.println("===================");

       //ques.no.2

      System.out.println(n%10);
      System.out.println(n/10%10);
      System.out.println(n/100%10);
      System.out.println(n/1000%10);

      System.out.println("===================");


      // ques.no.2 (2nd methods)
     
      
      while(n>0){

          System.out.println(n%10);
            
         n=n/10;
           
         }

      


    }


}
