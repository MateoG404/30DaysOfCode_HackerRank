import java.util.Scanner;
public class Solution {
    public static int Factorial(int n) {
      
      // Base recursion
      if (n<=1)
        return 1;
      else
        return n * Factorial(n-1);

    }

    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int number = Factorial (scan.nextInt());
      System.out.println(number);
      scan.close();
