class Sphere
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double r1=40;
                 double r2=20;
                getSurfaceArea(r1);
                getDiameter(r1);
                getVolume(r1);
                System.out.println("======================");
                getSurfaceArea(r2);
                getDiameter(r2);
                getVolume(r2);
       }
   
        public static void getSurfaceArea(double r){

              System.out.println("This is SurfaceArea method");
             
              System.out.println("radius is: "+r+"unit");
              System.out.println("SurfaceArea is:"+4*3.14*r*r);
               
              
             }
          public static void getDiameter(double r){

              System.out.println("This is Diameter method");
            
              System.out.println("Diameter is: "+ 2*r);
               
              
             }
            
       public static void getVolume(double r){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+(4/3)* 3.14*r*r*r);

     }    
    

}
