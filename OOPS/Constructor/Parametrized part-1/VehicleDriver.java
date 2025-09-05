

class VehicleDriver{
      public static void main(String[] args){
             Vehicle v1 = new Vehicle("TATA" , 2352.2 , "BLACK");
               Vehicle v2 = new Vehicle("HONGA" ,454.56 , "WHITE");
               Vehicle v3 = new Vehicle("MG" , 66655.2 , "RED");
               Vehicle v4 = new Vehicle(); 
                Vehicle v5 = new Vehicle("MG");
                 Vehicle v6 = new Vehicle("MG" , 666555);



              System.out.println(v1.getDetails());
		System.out.println(v2.getDetails());
		System.out.println(v3.getDetails());
                System.out.println(v4.getDetails());
                System.out.println(v5.getDetails());
                System.out.println(v6.getDetails());
		

   }

}