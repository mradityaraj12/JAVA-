class Cube
{
          public static void main(String[] args){
            System.out.println("This is main method");
                 double s1=10;
                 double s2=20;
                getLateralArea(s1);
                getTotalArea(s1);
                getVolume(s1);
                System.out.println("======================");
                getLateralArea(s2);
                getTotalArea(s2);
                 getVolume(s2);
      }
   
        public static void getLateralArea(double s){

              System.out.println("This is LateraArea method");
             
              System.out.println("Side is: "+s);
              System.out.println("LateralArea is:"+4*s*s);
               
              
             }
          public static void getTotalArea(double s){

              System.out.println("This is getTotalArea method");
            
              System.out.println("TotalArea is: "+ 6*s*s);
               
              
             }
            
       public static void getVolume(double s){

              System.out.println("This is getVolume method");
            
              System.out.println("Volume is: "+ s*s*s);

     }    
    

}
