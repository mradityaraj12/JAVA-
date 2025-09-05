
class Vehicle{

       String name;
       double price;
       String color;
          Vehicle(){
           
          }

        Vehicle(String name){
            
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
             this.price=price;
              this.name=name;

           }

      Vehicle(String name , double price , String color) {
                this.name = name;
                this.price = price;
                this.color = color;
         
        }
         
    public String getDetails(){
	return "Name is: "+name+"\nPrice is: "+price+"\nColoris:"+color+"\n===========";
	}
          
   }


    