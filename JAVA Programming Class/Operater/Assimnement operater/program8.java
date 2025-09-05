// Operater Based Programming.

class program4{
   public static void main(String[] args){
      
    //Ques.no.8 = Revers a 3-digite number using pure Arithmetic operater?
       
     int n = 12345;
        int rev = (n%10)*10000+((n/1000)%1000)*1000+((n/100)%100)*100+((n/10)%10)*10+n/10000;

           //int rev = (n%10)*100+((n/10)%10)*10+n/100;
            
            System.out.println(rev);

      }     


}
