
class Vehicle{

       String name;
       int price;
       String color;
          Vehicle(){
              System.out.println("NO-Argument Constructor");
          }

           Vehicle (double x) {
             
           }

            
        // Copy Constructor:-


      Vehicle(Vehicle x){
         this.name=x.name;
         this.price=x.price;
         this.color=x.color;

         }



        Vehicle(String name){

              this();
            this.name=name; 
         }

  
       

       Vehicle(int price){

            this.price=price;
        }
       
       Vehicle(String name , int price){
               
                
               this.name=name;
               this.price=price;

         }

      Vehicle(int price , String name){
            
               this(name ,price);

           }

      Vehicle(String name , int price , String color) {
                    
              this(name , price);


                // this.name = name;
                 //this.price = price;

                 this.color = color;
         
        }
         
    public String getDetails(){
	return "Name is: "+name+"\nPrice is: "+price+"\nColor is:"+color+"\n===========";
	}
          
   }


    