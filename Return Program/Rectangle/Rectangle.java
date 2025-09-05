class Rectangle
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double l1=5.0, w1=4.0;
                 double l2=25, w2=10;
                double area1=getArea(l1,w1);
                double perimeter1=getPerimeter(l1,w1);

                System.out.println("======================");
                 double area2=getArea(l2,w2);
                 double perimeter2=getPerimeter(l2,w2);

                System.out.println("======================");
                double totalArea=area1+area2;
                double totalPerimeter=perimeter1+perimeter2;
                System.out.println("Total Area is:"+totalArea);
                System.out.println("Total Perimeter is:"+totalPerimeter);

      }
   
        public static double getArea(double l, double w){

              System.out.println("This is getArea method");
             
              System.out.println("length is: "+l+"width is:"+w+"unit");
              System.out.println("Area is:"+l*w+"sq.unit");

               double area=l*w;
                  return area;

               
              
             }
          public static double getPerimeter(double l, double w){

              System.out.println("This is getPerimeter method");
            
              System.out.println("Perimeter is: "+ 2*(l+w)+"unit");

               double perimeter=2*(l+w);
                return perimeter;

               
              
             }

       
         
    

}
