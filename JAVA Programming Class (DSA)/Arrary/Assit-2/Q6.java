
class Q5{
    public static void main(String[] args){
     String[] names = {"Mohan", "Aditya", "Raj", "Madhavi", "Rohan"};
        
       
       
          System.out.println("String Having Even number of Characters Are:");
               displayValues(names);
          
            
        
                 
}
  public static void displayValues(String[] names){
           int count=0;
         for(String name:names){
            if(name.length() % 2 == 0){
                  System.out.println(name);
                    count++;
           }
      }

    System.out.println("Total Counts Are :" + count);

  }

}