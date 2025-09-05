class EmpolyDeriver{
      public static void main(String[] args){
          System.out.println("EmployDriver Program is Starts");
            System.out.println("Company Name is :"+ Employ.CompName);

          Employ.giveBiometric();
         Employ e1=new Employ();
          e1.name="Aditya";


          System.out.println("Employ Name is:" + e1.name);
          e1.work();
          System.out.println("Employ Company Name is:" + e1.CompName);


          e1.giveBiometric();
          Employ e2 = new Employ();
           Employ e3 = new Employ();

           
          e1.setDetails("Mohan" ,  123 , 12458.5 , "black");
          e2.setDetails("Rohan" , 4556 , 45812.5 , "Red");
          e3.setDetails("Sohan" , 8523 , 5258.5 , "Blue");


          e1.printDetails();
          e2.printDetails();
          e3.printDetails();
   
  
 

               
    }

} 
