// Operater Based Programming.

class program4{
   public static void main(String[] args){
      
    //Ques.no.4 = for the given three no. swap 1st into 2nd, 2nd into 3rd, and 3rd into 1st number?
       
      int a =10;
      int b = 20;
      int c = 40;
           
         a = a + b + c;
         b = a - (b + c);
         c = a - (b + c);
         a = a - (b + c);
          
            System.out.println(a);  

            System.out.println(b); 
             System.out.println(c);

      }     


}
