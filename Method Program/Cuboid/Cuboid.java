class Cuboid
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double l1=10, w1=12, h1=20;
                 double l2=20, w2=25, h2=40;
                getLateralArea(l1,w1,h1);
                getTotalArea(l1,w1,h1);
                getVolume(l1,w1,h1);
                System.out.println("======================");
                getLateralArea(l2,w2,h2);
                getTotalArea(l2,w2,h2);
                 getVolume(l2,w2,h2);
      }
   
        public static void getLateralArea(double l, double w, double h){

              System.out.println("This is LateraArea method");
             
              System.out.println("length is: "+l+"width is:"+w+"height is: "+h+"unit");
              System.out.println("LateralArea is:"+2*h*(l*w));
               
              
             }
          public static void getTotalArea(double l, double w, double h){

              System.out.println("This is getTotalArea method");
            
              System.out.println("TotalArea is: "+2*(l*w+w*h+h*l));
               
              
             }
            
       public static void getVolume(double l, double w, double h){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+ l*w*h);

     }    
    

}
