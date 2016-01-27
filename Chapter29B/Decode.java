import java.io.*;  
import java.util.*;  
  
public class SecretCode {  
   public static void main(String[] args) throws Exception {  
      Scanner in = new Scanner(new File("code.txt"));  
      String keyphrase = in.nextLine();  
      String message = "";  
      while (in.hasNextInt()) {  
         message += keyphrase.charAt(in.nextInt());  
      }  
      System.out.println(message);  
   }  
}  