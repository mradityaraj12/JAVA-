class Service{

       public void accessAllEmploy(Employ[] employees){
              for(Employ e : employees)
               System.out.println(e);
    }
     public void printAndCountAllEmployWithAge(Employ[] employees){
            int count =0;
              for(Employ e : employees){
                   if(e.age>30){
                        System.out.println(e);
                           count++;
                         }
               }
            System.out.println("Total Such Employees are : " + count);
       }

    public static void printEmployWithHighestAndLeastSalary(Employ[] employees){
             Employ big = employees[0];         
             Employ small = employees[0];
                     for(Employ e : employees){
                            if(e.salary>big.salary)
                                    big=e;
                            else if(e.salary<small.salary)
                                     small=e;
                          }
               System.out.println("Max Salary Employ Details:"+big);
               System.out.println("Min Salary Employ Details:"+small);
       } 

      public static void SearchEmployById(Employ [] employess, int id){
             boolean found = false;
              for(Employ e: employess){
             if(e.id == id){
                 System.out.println("Employ Found :" +e);
                  found = true;
                  break;
               }
             }
        if(!found){
                System.out.println("No Employ found with ID :"+id);
     }
  } 
   
  public static void SearchEmployByName(Employ[] employees, String name){
        boolean found = false;
           for(Employ e : employees){
             if(e.name.equalsIgnoreCase(name)){
                 System.out.println("Employ found : " + e);
                     found = true;
                          break;
                      }
                 }
           if(! found){
                 System.out.println("NO Employees found With Name:"+name);
          }
       }   


     public static void PrintAndCountEmployAverageAgeSalary(Employ[] employees){
           double sum = 0;
            for(Employ e: employees){
                sum = sum + e.salary;
              }
       double avg = sum/employees.length;
          System.out.println("Average Salary is :"+avg);
              
     int count = 0;
            System.out.println("Employ Having Salary More Than Average:");
                 for(Employ e: employees){
                      if(e.salary > avg){
                          System.out.println(e);
                             count++;
                           }
                       }
      System.out.println("Tatal Employees Above Average Salary Is : " + count);

        
    }
                    
  }
