import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      int [] arrayNumbers = new int [size];
      // Add numbers in the array
      for(int i = 0 ; i < size ; i++){
        arrayNumbers[i] =  scan.nextInt() ;
      }
      scan.close();
      //int x = size;     
      for (int x = size -1 ; 0 <= x; x--){
        System.out.print(arrayNumbers[x] + " ");
      }
     
}}
