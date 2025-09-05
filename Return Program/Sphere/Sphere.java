class Sphere
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double r1=40;
                 double r2=20;
                double surfacearea1=getSurfaceArea(r1);
                double diameter1=getDiameter(r1);
                double volume1=getVolume(r1);
                System.out.println("======================");
                double surfacearea2=getSurfaceArea(r2);
                double diameter2=getDiameter(r2);
                 double volume2=getVolume(r2);

                   System.out.println("======================");

                double totalSurFaceArea=surfacearea1+surfacearea2;
                double totalDiameter=diameter1+diameter2;
                double totalVolume=volume1+volume2;
                System.out.println("Total SurFacearea is:"+totalSurFaceArea);
                System.out.println("Total Area is:"+totalDiameter);
                System.out.println("Total Volume is:"+totalVolume);


       }
   
        public static double getSurfaceArea(double r){

              System.out.println("This is SurfaceArea method");
             
              System.out.println("radius is: "+r+"unit");
              System.out.println("SurfaceArea is:"+4*3.14*r*r);

                     double surfacearea=4*3.14*r*r;
                return surfacearea; 
               

               
              
             }
          public static double getDiameter(double r){

              System.out.println("This is Diameter method");
            
              System.out.println("Diameter is: "+ 2*r);
                
                     double diameter=2*r;
                        return diameter;


               
              
             }
            
       public static double getVolume(double r){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+(4/3)* 3.14*r*r*r);
                 double volume=(4/3)*3.14*r*r*r;
                    return volume;

     }    
    

}
