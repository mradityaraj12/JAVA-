//  No- Argument 


class Vehicle{

       String name;
       double price;
       String color;
          Vehicle(){
           
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


    