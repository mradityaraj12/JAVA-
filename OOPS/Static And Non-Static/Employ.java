
class Employ{
       static int x = 24;
        int y = 12;
            public static void test(){
               System.out.println("Static Test Methods");
               System.out.println("x Is : " + x);
               demo();
              Employ e1 = new Employ();
              System.out.println("y is:" + e1.y);

      }
      
       public static void demo() {
                System.out.println("Static Demo Method");
  }

      public void work(){
          System.out.println("Non Static Work  Method");
            System.out.println("y is : " + y);
            dance();
             System.out.println("x Is : " +x);
             demo();
             x = 12345;
    } 
    public void dance() {
                 System.out.println("Non Static Dance Method");
                             
         }
            
   public static void main(String[] args){
                 System.out.println("Main Method Starts");
                   test();
                   System.out.println("=========================");
                 Employ e1 =new Employ();
               System.out.println("x is : " +x);
                 e1.work();
                  System.out.println("x Is : " + x);
             
               }

   }
