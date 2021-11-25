import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
      Scanner entry = new Scanner(System.in);
      int n = entry.nextInt();
      entry.close();
      for (int i = 1; i<=10; i++){
        int mult = n * i;
        System.out.println(n + " x " + i + " = " + mult);
      }
    }
}
