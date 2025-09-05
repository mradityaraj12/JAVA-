class Cylinder
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double r1=5.0, h1=4.0;
                 double r2=25, h2=10;
                getLateralArea(r1,h1);
                getTotalArea(r1,h1);
                getVolume(r1,h1);
                System.out.println("======================");
                getLateralArea(r2,h2);
                getTotalArea(r2,h2);
                 getVolume(r2,h2);
      }
   
        public static void getLateralArea(double r, double h){

              System.out.println("This is getArea method");
             
              System.out.println("radius is: "+r+"hight is:"+h+"unit");
              System.out.println("LateralArea is:"+2*3.14*r*h);
               
              
             }
          public static void getTotalArea(double r, double h){

              System.out.println("This is getTotalArea method");
            
              System.out.println("TotalArea is: "+ 2*3.14*r*r*h);
               
              
             }
            
       public static void getVolume(double r, double h){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+ 3.14*r*r*h);

     }    
    

}
