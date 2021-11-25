import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
      Scanner entry = new Scanner(System.in);
      int cases = entry.nextInt();
      entry.nextLine();

      for (int i = 0  ; i<cases; ++i){
        String word = entry.nextLine();
        int len = word.length();

        for (int x = 0 ; x < len; x+=2 ){
          System.out.print(word.charAt(x));
        }

        System.out.print(" ");

        for (int x = 1 ; x < len; x+=2 ){
          System.out.print(word.charAt(x));
        }
        System.out.println();
     
      }
      entry.close();

    }
}
