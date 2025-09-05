class Cuboid
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double l1=10, w1=12, h1=20;
                 double l2=20, w2=25, h2=40;
                double lateralarea1 =getLateralArea(l1,w1,h1);
                double totalarea1 =getTotalArea(l1,w1,h1);
                double volume1 =getVolume(l1,w1,h1);
                System.out.println("======================");
                double lateralarea2 =getLateralArea(l2,w2,h2);
                double totalarea2 =getTotalArea(l2,w2,h2);
                 double volume2 =getVolume(l2,w2,h2);

                  System.out.println("======================");

                double totalLateralArea=lateralarea1+lateralarea2;
                double totalArea=totalarea1+totalarea2;
                double totalVolume=volume1+volume2;
                System.out.println("Total Lateralarea is:"+totalLateralArea);
                System.out.println("Total Area is:"+totalArea);
                System.out.println("Total Volume is:"+totalVolume);


      }
   
        public static double getLateralArea(double l, double w, double h){

              System.out.println("This is LateraArea method");
             
              System.out.println("length is: "+l+"width is:"+w+"height is: "+h+"unit");
              System.out.println("LateralArea is:"+2*h*(l*w));
               double lateralarea=2*h*(l*w);
                return lateralarea; 
               


               
              
             }
          public static double getTotalArea(double l, double w, double h){

              System.out.println("This is getTotalArea method");
            
              System.out.println("TotalArea is: "+2*(l*w+w*h+h*l));
                   double totalarea=2*(l*w+w*h+h*l);
                        return totalarea;

               
              
             }
             
       public static double getVolume(double l, double w, double h){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+ l*w*h);

              double volume=l*w*h;
                    return volume;


     }    
    

}
