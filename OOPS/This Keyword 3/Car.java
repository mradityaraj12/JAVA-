class Car{
     
     String name;  double price; String color;
      public void setDetails(String name , double price , String color) {
           this.name = name;
           this.price = price;
           this.color = color;
     }
    
      public String getDetails() {
          return " Name is : " + name +"\n Price is : " + price +"\n Color is :" + color + "\n ===================";
     
      }
       
       public static void main(String[] args) {
            System.out.println(" Program is Starts:");
              Car c1 = new Car();
              c1.setDetails("TATA" , 252525.2 , "Black");
              String details1 = c1.getDetails();
              System.out.println(details1);
                Car c2 = new Car ();
                Car c3 = new Car();

               /*   c2.name = "HONDA";
                  c2.price = 454545.5;
                  c2.color = "RED";
                 */
                   

                c2.setDetails("HONDA" , 454545.5 , "REd");

                c3.setDetails("BMW" , 85856.2 , "WHITE");
           
               
              /*  System.out.println("Name is : " + c2.name);
               System.out.println("Price is : " + c2.price);
               System.out.println("Color is : " + c2.color);
               System.out.println("========================");
               */

               System.out.println( c2.getDetails() );
               System.out.println( c3.getDetails() );
          
                  
         }
      
 } 
