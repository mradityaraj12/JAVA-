class square
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double s1=2.0; 
                 double s2=4.0;
                 double area1=getArea(s1);
                System.out.println("======================");
                double perimeter1=getPerimeter(s2);


                
                System.out.println("======================");
                double totalArea=area1;
                double totalPerimeter=perimeter1;
                System.out.println("Total Area is:"+totalArea);
                System.out.println("Total Perimeter is:"+totalPerimeter);

      }
   
        public static double getArea(double s1){

              System.out.println("This is getArea method");
              System.out.println("radius is:"+s1);
              System.out.println("Area is: "+ s1*s1);
          
                    double area=s1*s1;
                  return area;


               
              
             }
          public static double getPerimeter(double s2){

              System.out.println("This is getPerimeter method");
              System.out.println("radius is:"+s2);
              System.out.println("Perimeter is: "+ 4*s2);

                    double perimeter=4*s2;
                return perimeter;

               
              
             }

       
         
    

}
