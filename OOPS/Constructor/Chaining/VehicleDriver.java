

class VehicleDriver{
      public static void main(String[] args){

              Vehicle v1 = new Vehicle("TATA" , 235255 , "BLACK");
              System.out.println(v1.getDetails());

               Vehicle v2 = new Vehicle("HONGA" ,4544565 , "WHITE");
               System.out.println(v2.getDetails());

                Vehicle v3 = new Vehicle("MG" , 6665525 , "RED");
                System.out.println(v3.getDetails());

                Vehicle v4 = new Vehicle();
                System.out.println(v4.getDetails());
 
                 Vehicle v5 = new Vehicle("MG");
                 System.out.println(v5.getDetails());

                  Vehicle v6 = new Vehicle("MG" , 666555);
                  System.out.println(v6.getDetails());  


                   Vehicle v7 = new Vehicle("Maruti");
                   System.out.println(v7.getDetails());

                  
                   Vehicle v8 = new Vehicle("Aditya Car");
                   System.out.println(v8.getDetails());

               
                   Vehicle v9 = new Vehicle(v1);
                   System.out.println(v9.getDetails());

                   
                   Vehicle v10 = new Vehicle(v5);
                   System.out.println(v10.getDetails());

                   
                   Vehicle v11 = new Vehicle(v7);
                   System.out.println(v11.getDetails());

             
		
		
               
               
               
		

   }

}