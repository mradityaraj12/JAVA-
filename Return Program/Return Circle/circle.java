class circle
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double r1=5.0;
                 double r2=2.0;
                 double area1= getArea(r1);
                 double perimeter1= getPerimeter(r1);
                
                System.out.println("======================");
                
                 double perimeter2= getPerimeter(r2);
                 double area2= getArea(r2);

                System.out.println("======================");
                double totalArea=area1+area2;
                double totalPerimeter=perimeter1+perimeter2;
                System.out.println("Total Area is:"+totalArea);
                System.out.println("Total Perimeter is:"+totalPerimeter);
      }
   
        public static double getArea(double r1){

              System.out.println("This is getArea method");
              System.out.println("radius is:"+r1);
              System.out.println("Area is: "+ 3.14*r1*r1);
               
                   double area=3.14*r1*r1;
                  return area;
             }
          public static double getPerimeter(double r2){

              System.out.println("This is getPerimeter method");
              System.out.println("radius is:"+r2);
              System.out.println("Perimeter is: "+ 2*3.14*r2);
               double perimeter=2*3.14*r2;
                return perimeter;
              
             }

       
         
    

}
