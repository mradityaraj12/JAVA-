class Car{
    int x = 40;

      public void set(){
          int x = 60;
          System.out.println(x);
          System.out.println(this.x);
          this.x = x;
        System.out.println(this.x);
        System.out.println(this.x);


     }
          
          public static void main(String[] args){
             System.out.println("program Starts");
             Car c1 = new Car();
             System.out.println("x Before calling set method : " + c1.x);
           System.out.println("===============");
           
           c1 .set();
          System.out.println("x After calling set method : " + c1.x);

     }
 } 
