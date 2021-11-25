import java.util.Scanner;
import java.math.*;
public class Solution {
    public static void main(String[] args) {

      Scanner entry = new Scanner(System.in);
      double mealCost = entry.nextDouble();
      int taxPercent = entry.nextInt();
      int tipPercent = entry.nextInt();
      double totalCost;

      entry.close();

      totalCost = ((taxPercent*mealCost)/100) +((tipPercent * mealCost)/100) + mealCost ;
      int total = (int) Math.round(totalCost);
      System.out.println(total);
  
    }
}
