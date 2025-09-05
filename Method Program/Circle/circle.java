class circle
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double r1=5.0;
                 double r2=2.0;
                getArea(r1);
                
                System.out.println("======================");
                
                getPerimeter(r2);
      }
   
        public static void getArea(double r1){

              System.out.println("This is getArea method");
              System.out.println("radius is:"+r1);
              System.out.println("Area is: "+ 3.14*r1*r1);
               
              
             }
          public static void getPerimeter(double r2){

              System.out.println("This is getPerimeter method");
              System.out.println("radius is:"+r2);
              System.out.println("Perimeter is: "+ 2*3.14*r2);
               
              
             }

       
         
    

}
