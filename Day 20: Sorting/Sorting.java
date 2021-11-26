import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arrayNumbers = new int[n];
        // Add the elements 
        for(int i = 0 ; i < n ; i++){
          arrayNumbers[i] = scan.nextInt() ;
        }
        scan.close();
        // Bubble Sort
        int swaps  = 0 ; 
        for (int i = 0 ;i < n ; i ++){
          boolean band = true ;
          
          for (int j = 0 ; j < n -1 ; j++){
            if(arrayNumbers[j] > arrayNumbers[j+1]){
              int temp = arrayNumbers[j] ; 
              arrayNumbers[j] = arrayNumbers[j+1] ;
              arrayNumbers[j+1] = temp ;
              swaps += 1 ;
              band = false ;
            }
          }
          if (band)
            break ;
        }
        // Printer 
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+arrayNumbers[0]);
        System.out.println("Last Element: " + arrayNumbers[n-1]);
        
    }
}
