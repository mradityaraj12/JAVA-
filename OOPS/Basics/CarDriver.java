class CarDriver{
      public static void main(String[] args){
      Car c1=null;
      Car c2=new Car();
      Car c3=new Car();
      System.out.println(c1);
       System.out.println(c2);
       System.out.println(c3);
       c2.name="TATA";
       c2.price=23546.22;
       c2.color="RED";
       c3.name="HONDA";
       c3.price=2564564.45;
       c3.color="BLUE";
      System.out.println("==============");
      System.out.println(c2.name);
      System.out.println(c2.price);
      System.out.println(c2.color);

       System.out.println("==============");
      System.out.println(c3.name);
      System.out.println(c3.price);
      System.out.println(c3.color);

        System.out.println("==============");

         c2.Start();

     
      }





} 
