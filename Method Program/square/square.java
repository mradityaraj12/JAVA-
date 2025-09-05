class square
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double s1=2.0; 
                 double s2=4.0;
                getArea(s1);
                System.out.println("======================");
                getPerimeter(s2);
      }
   
        public static void getArea(double s1){

              System.out.println("This is getArea method");
              System.out.println("radius is:"+s1);
              System.out.println("Area is: "+ s1*s1);
               
              
             }
          public static void getPerimeter(double s2){

              System.out.println("This is getPerimeter method");
              System.out.println("radius is:"+s2);
              System.out.println("Perimeter is: "+ 4*s2);
               
              
             }

       
         
    

}
