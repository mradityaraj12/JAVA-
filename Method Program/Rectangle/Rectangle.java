class Rectangle
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double l1=5.0, w1=4.0;
                 double l2=25, w2=10;
                getArea(l1,w1);
                getPerimeter(l1,w1);
                System.out.println("======================");
                getArea(l2,w2);
                getPerimeter(l2,w2);
      }
   
        public static void getArea(double l, double w){

              System.out.println("This is getArea method");
             
              System.out.println("length is: "+l+"width is:"+w+"unit");
              System.out.println("Area is:"+l*w+"sq.unit");
               
              
             }
          public static void getPerimeter(double l, double w){

              System.out.println("This is getPerimeter method");
            
              System.out.println("Perimeter is: "+ 2*(l+w)+"unit");
               
              
             }

       
         
    

}
