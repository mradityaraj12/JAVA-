class Car{
    int x;

      public void set(int x){
          
          this.x = x;
        
     }

       public void printValue() {
               System.out.println("x is : " + x);
       
      }
          
          public static void main(String[] args){
             System.out.println("program Starts");
             Car c1 = new Car();
            Car c2 = new Car();
            Car c3 = new Car();
            c1.set (100);
            c2.set (200);
            c3.set (300);
           c1.printValue();
           c2.printValue();
           c3.printValue();

  
     }
 } 
