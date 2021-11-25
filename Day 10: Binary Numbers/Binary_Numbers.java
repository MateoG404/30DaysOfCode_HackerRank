import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
      int cont = 0 ;
      int tempCont = 0;

      while( 0 < number ){
        
        if (number % 2 == 1 ){
          tempCont++;
        }else{
          if (cont < tempCont )
            cont = tempCont;
          tempCont = 0;
        }
        number = number / 2 ;

      }
      if (cont < tempCont )
          cont = tempCont;
      System.out.print(cont);
    }

}
