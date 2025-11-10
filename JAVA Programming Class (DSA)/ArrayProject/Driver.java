class Driver{
   public static void main(String[] args){
         Employ e1 = new Employ("Aditya", 112, 20, 12540.8);
         Employ e2 = new Employ("Mohan", 122, 24, 15540.8);
         Employ e3 = new Employ("Madhavi", 102, 33, 22540.8);
         Employ e4 = new Employ("Raj", 222, 21, 32540.8);
         Employ e5 = new Employ("Rohan", 252, 40, 45540.8);
         Employ e6 = new Employ("John", 128, 24, 45590.8);
         Employ e7 = new Employ("Heera", 252, 28, 62840.8);
         Employ e8 = new Employ("Raju", 320, 30, 86540.8);
         Employ e9 = new Employ("Nitin", 256, 22, 53740.8);
         Employ e10 = new Employ("Pinki", 182, 23, 35540.8);

     Employ[] employees = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};
        Service service = new Service();
           System.out.println("===========Q1========");
                service.accessAllEmploy(employees);
          System.out.println("==========Q2=======");
                service.printAndCountAllEmployWithAge(employees);
         System.out.println("==========Q3=======");
                service.printEmployWithHighestAndLeastSalary(employees);
       System.out.println("==========Q4=======");
                service.SearchEmployById(employees, 124 );

     System.out.println("==========Q5=======");
                service.SearchEmployByName(employees, "Aditya" );

     
     System.out.println("==========Q6=======");
                service.PrintAndCountEmployAverageAgeSalary(employees);
   }

}
