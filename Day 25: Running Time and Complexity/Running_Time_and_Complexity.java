import java.util.Scanner;

public class Solution {
    public static boolean Primes(int number ){
      boolean band = true ;
      if(number <= 1)
        return false; 
      else {
        for(int i = 2 ; i < (number / 2) +1 ;i++){
        if(number%i == 0)
          return false ; 
      }
      return true;
      }
      
    }
    public static void main(String[] args) {
      Scanner scan =  new Scanner(System.in);
      int cases = scan.nextInt();
      for(int i = 0 ; i <cases;i++){
        int number = scan.nextInt();
        if(Primes(number))
          System.out.println("Prime");
        else
          System.out.println("Not prime");
      }
    }
}



