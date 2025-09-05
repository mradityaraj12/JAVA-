// Generate Random Number

     import java.util.Random;


class program1{
        public static void main(String[] abc) {
               System.out.println("MY NAME ADITYA RAJ");
               
                Random r1=new Random();
              int ran1=r1.nextInt();
              int ran2=r1.nextInt(100);
            
            System.out.println("Random Number1  is:" + ran1);
            System.out.println("Random Number2 is:"+ ran2);


    }


}