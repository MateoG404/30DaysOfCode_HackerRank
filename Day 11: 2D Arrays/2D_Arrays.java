import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      int finalArray[][] = new int[6][6];
      boolean band = true;
      // add elements 
      for (int r = 0 ; r<6;r++){
        int temp [] = new int [6];
        for (int i = 0 ; i<6;i++){
          temp[i] = scan.nextInt();
          if (temp[i]<0)
            band = false;
        }
        finalArray[r] = temp;
      }
      scan.close();
      int summatory = 0 ;
      if (band == false)
        summatory = -10000;

      for (int j = 0 ; j<4; j++){
        int tempB = 0 ; int x = 0; int y = 0;
        for (int i = 0 ; i<4; i++){
          tempB += finalArray[j][i] + finalArray[j][i+1] + finalArray[j][i+2];
          x = j +1 ; 
          tempB += finalArray[x][i+1];
          y =j + 2;
          tempB += finalArray[y][i] + finalArray[y][i+1] + finalArray[y][i+2];
          
          if(tempB > summatory){
            summatory = tempB;
          }
          tempB = 0;
          
        }
      }
      System.out.println(summatory);
    }
}
