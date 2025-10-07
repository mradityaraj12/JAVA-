import java.util.*;

class program2{
      
      static Scanner sc = new Scanner(System.in);
          static int big = 0;

       public static void main(String[] args){
                  getBig();
                  System.out.println("Biggest Value Is :" + big);
    
                 }
              
             public static void getBig(){
                      System.out.println("Enter the Number : ");
                       
                      int a = sc.nextInt();
                      big =big>a?big:a;
                      System.out.println("Press Y/y to Continue....");
             
                     char c = sc.next().charAt(0);
                          if(c=='Y' || c=='y'){
                             getBig();
                                     

                  }
               

    }



}
