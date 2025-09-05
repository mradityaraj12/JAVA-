class Car{
    int x = 40;
      public void set(){
         
          System.out.println(x);
          System.out.println("Enter Set : " + this);
   

     }
          
          public static void main(String[] args){
             System.out.println("program Starts");
             Car c1 = new Car();
             c1.set();
             System.out.println("from Main: " + c1);
           System.out.println("===============");
           Car c2 = new Car();
           c2 .set();
          System.out.println("From Main : " + c2);

     }
 } 
