import java.util.*;

class Squares{

       public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the Number:");
                   int n = sc.nextInt();
                   int sum = getSum(n);
                  System.out.println("Sum of Squares of "+n+"Number is :"+sum);

    
                 }
              
             public static int getSum(int n){
                     if(n>100){
                       return n*n+getSum(n-1);
                      }else{
                          return n;
                                     

                  }
               

    }



}
