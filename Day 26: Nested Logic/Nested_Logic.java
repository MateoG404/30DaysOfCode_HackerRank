import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
      int [] first = new int[3] ;
      int [] second = new int[3];
      for(int i = 0 ; i< 3; i ++ ){
        first[i] = scan.nextInt();
      }
      for (int i = 0 ; i < 3 ; i ++){
        second[i] = scan.nextInt();
      }
      scan.close();
      // Comparative
      int fine = 0;
      if(first[2]<second[2] ){
        //System.out.println(fine);
      }else{
          if(first[2] > second[2]){
          int temp = Math.abs(first[2] - second[2]) ;
          fine = 10000;
        }
        else if (first[1] > second[1]){
          int temp = Math.abs(first[1] - second[1]);
          fine += 500 * (temp) ;
        }
        else if(first[0] > second[0]){
          int temp = Math.abs(first[0] - second[0]);

          fine += 15 * temp ;
        }
      }
      


      System.out.println(fine);      
    }
}
