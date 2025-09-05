class Cube
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double s1=10;
                 double s2=20;
                double lateralarea1=getLateralArea(s1);
               double totalarea1= getTotalArea(s1);
                double volume1=getVolume(s1);

              System.out.println("======================");
                double lateralarea2=getLateralArea(s2);
                double totalarea2=getTotalArea(s2);
                 double volume2=getVolume(s2);

               
                 System.out.println("======================");

                double totalLateralArea=lateralarea1+lateralarea2;
                double totalArea=totalarea1+totalarea2;
                double totalVolume=volume1+volume2;
                System.out.println("Total Lateralarea is:"+totalLateralArea);
                System.out.println("Total Area is:"+totalArea);
                System.out.println("Total Volume is:"+totalVolume);


      }
   
        public static double getLateralArea(double s){

              System.out.println("This is LateraArea method");
             
              System.out.println("Side is: "+s);

               double lateralarea=4*s*s;

              System.out.println("LateralArea is:"+4*s*s);
                  return lateralarea; 
               
              
             }
          public static double getTotalArea(double s){

              System.out.println("This is getTotalArea method");

                 double area=6*s*s;
                 
              System.out.println("TotalArea is: "+ 6*s*s);
               return area;
              
             }
            
       public static double getVolume(double s){

              System.out.println("This is getVolume method");

                    double volume=s*s*s;

              System.out.println("Volume is: "+ s*s*s);
                    return volume;
     }    
    

}
