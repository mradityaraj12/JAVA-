// Design a class / Blueprint for Vehicle


class VehicleDriver{
          public static void main(String[] args){

             Vehicle v1=new Vehicle();
             Vehicle v2=new Vehicle();
             Vehicle v3=new Vehicle();


            v1.setDetails("car",12345.6, "red");
            v2.setDetails("Bike",56345.6, "Black");
             v3.setDetails("Honda",458955.6, "white");


              String details1=v1.getDetails();
              System.out.println(details1);
              System.out.println(v2.getDetails());
              System.out.println(v3.getDetails());

        }


   }
