// Generate Random Number

     import java.util.Random;


class program2{
        public static void main(String[] abc) {
               System.out.println("MY NAME ADITYA RAJ");
               
                Random r1=new Random();

              int min=1000;
              int max=10000;
            
             int randomNumber=min+(int)(r1.nextInt(max-min));
            System.out.println("Random Number2 is:"+ randomNumber);


    }


}