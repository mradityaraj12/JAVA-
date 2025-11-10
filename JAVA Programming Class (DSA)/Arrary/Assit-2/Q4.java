
class Q4{
    public static void main(String[] args){
     String[] names={"Mohan", "Aditya", "Raj", "Madhavi", "Rohan"};
        
       
       
          System.out.println("The Largest Nmae Are:");
               displayValues(names);
          
            
        
                 
}
  public static void displayValues(String[] names){
           String largest = names[0];
         for(String name:names){
            if(name.length()>largest.length())
                   largest = name;
           
      }

    System.out.println(largest);

  }

}