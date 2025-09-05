// Design a Class / Blueprint For Product,Furit,Mobile,Order.


class Program1{
      public static void main(String[] args){
      Product p1=new Product();
      Product p2=new Product();
       System.out.println(p1);
       System.out.println(p2);
       p1.name="ADIDAS";
       p1.price=23546.22;
       p1.color="RED";
       p2.name="COCA COLA";
       p2.price=25121.5;
       p2.color="BLUE";
      System.out.println("====================");
      System.out.println(p1.name);
      System.out.println(p1.price);
      System.out.println(p1.color);
      System.out.println("===================");
      System.out.println(p2.name);
      System.out.println(p2.price);
      System.out.println(p2.color);
      System.out.println("===================");
      p1.PrintDetails();
      p2.PrintDetails();
      System.out.println("==================");
       Furit f1=new Furit();
       Furit f2=new Furit();
       System.out.println(f1);
       System.out.println(f2);
       f1.name="APPLE";
       f1.price=4564.4;
       f1.color="RED";
       f2.name="MANGO";
       f2.price=20054.1;
       f2.color="YELLOW";
      System.out.println("====================");
     System.out.println(f1.name);
      System.out.println(f1.price);
      System.out.println(f1.color);
     System.out.println("===================");
      System.out.println(f2.name);
      System.out.println(f2.price);
      System.out.println(f2.color);
      System.out.println("===================");
      f1.PrintDetails();
      f2.PrintDetails();
       System.out.println("==================");
       Mobile m1=new Mobile();
       Mobile m2=new  Mobile();
       System.out.println(m1);
       System.out.println(m2);
       m1.name="MOTOROLA EDGE 50 FUSSION";
       m1.price=190000.4;
       m1.color="GRAY";    
       m1.x=5;
       m2.name="IPHONE 16 PRO";
       m2.price=5200000.1;
       m2.color="BLACK";
       m2.x=10;
      System.out.println("====================");
     System.out.println(m1.name);
      System.out.println(m1.price);
      System.out.println(m1.color);
     System.out.println(m1.x);
     System.out.println("===================");
      System.out.println(m2.name);
      System.out.println(m2.price);
      System.out.println(m2.color);
     System.out.println(m2.x);
      System.out.println("===================");
      m1.PrintDetails();
      m2.PrintDetails();
     System.out.println("==================");
       Order o1=new Order();
       Order o2=new Order();
       System.out.println(o1);
       System.out.println(o2);
       o1.name="PIZZA";
       o1.price=235.4;
       o1.color="RED";    
       o1.x=25;
       o2.name="NIVEA FACE WASH";
       o2.price=520.1;
       o2.color="WHITE";
       o2.x=15;
      System.out.println("====================");
     System.out.println(o1.name);
      System.out.println(o1.price);
      System.out.println(o1.color);
     System.out.println(o1.x);
     System.out.println("===================");
      System.out.println(o2.name);
      System.out.println(o2.price);
      System.out.println(o2.color);
     System.out.println(o2.x);
      System.out.println("===================");
      o1.PrintDetails();
      o2.PrintDetails();




             
      }





} 
