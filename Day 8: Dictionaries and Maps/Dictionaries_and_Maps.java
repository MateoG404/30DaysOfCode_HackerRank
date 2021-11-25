import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static void main(String []argh){
      Scanner scan = new Scanner(System.in);
      int cases = scan.nextInt();
      Map<String, Integer > dictionary = new HashMap<String,Integer>();

      for (int x = 0 ; x<cases;x++){
  
        String name = scan.next();
        int number = scan.nextInt();
        dictionary.put(name,number);
      }
      while(scan.hasNext()){
        String value = scan.next();
        if (dictionary.get(value) != null)
          System.out.println(value + "=" +dictionary.get(value));
        else
          System.out.println("Not found");
        }
      }
    }

