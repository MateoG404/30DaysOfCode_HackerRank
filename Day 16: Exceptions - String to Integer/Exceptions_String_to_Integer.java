import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String word = scan.next();
      scan.close();
      try {
        Integer number = Integer.parseInt(word);
        System.out.println(number);
      } catch (Exception e){
        System.out.println("Bad String");
      }
    }
}
