class Cylinder
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double r1=5.0, h1=4.0;
                 double r2=25, h2=10;
             
                double lateralarea1=getLateralArea(r1,h1);
                double totalarea1=getTotalArea(r1,h1);
               double volume1=getVolume(r1,h1);
                System.out.println("======================");
                double lateralarea2=getLateralArea(r2,h2);
                double totalarea2=getTotalArea(r2,h2);
                 double volume2=getVolume(r2,h2);

                 System.out.println("======================");

                double totalLateralArea=lateralarea1+lateralarea2;
                double totalArea=totalarea1+totalarea2;
                double totalVolume=volume1+volume2;
                System.out.println("Total Lateralarea is:"+totalLateralArea);
                System.out.println("Total Area is:"+totalArea);
                System.out.println("Total Volume is:"+totalVolume);

      }
   
        public static double getLateralArea(double r, double h){

              System.out.println("This is getArea method");
             
              System.out.println("radius is: "+r+"hight is:"+h+"unit");
              System.out.println("LateralArea is:"+2*3.14*r*h);
                    double lateralarea=2*3.14*r*h;
                return lateralarea; 
               

               
              
             }
          public static double getTotalArea(double r, double h){

              System.out.println("This is getTotalArea method");
            
              System.out.println("TotalArea is: "+ 2*3.14*r*r*h);

                     double totalarea=2*3.14*r*r*h;
                        return totalarea;


               
              
             }
            
       public static double getVolume(double r, double h){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+ 3.14*r*r*h);
                  double volume=3.14*r*r*h;
                    return volume;



     }    
    

}
