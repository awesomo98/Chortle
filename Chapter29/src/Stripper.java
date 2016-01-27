import java.util.Scanner;  
public class Stripper  
{  
   public static void main(String args[])  
   {  
      Scanner in = new Scanner(System.in);  
      String given = in.nextLine();  
      if(given.substring(0, 2).equals("//")||given.substring(0, 1).equals("/")||given.substring(0, 2).equals("*/"))  
         System.out.println(given);  
   }  
}  