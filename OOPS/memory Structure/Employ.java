class Employ{
      static String CompName="TATA";
    String name;
     int id;
    double price;
    String color; 
 
    public static void giveBiometric(){  
          System.out.println("Give Biometic at Biometic Machine");
     
     }

    public void work(){

        System.out.println(name+"is Working");
    
    }


        public void setDetails(String name , int id , double price , String color) {
          this.name = name;
          this.id = id;
          this.price = price;
          this.color = color;
    }
       
        
      public void printDetails() {
          System.out.println("Details are : " +CompName +" "+this.name +"   " + this.id +"   " + this.price +"   " +this.color);
 
    } 


} 



