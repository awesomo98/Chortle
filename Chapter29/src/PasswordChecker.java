import java.util.Scanner;  
import java.lang.Character;  
public class Ex6  
{  
   public static void main(String args[])  
   {  
      String given;  
        
      Scanner in = new Scanner(System.in);  
        
      System.out.println("Enter your password:");  
      given = in.nextLine();  
      boolean hasUpperCase = !given.equals(given.toLowerCase());  
      boolean hasLowerCase = !given.equals(given.toUpperCase());  
      while((given.length()<7) || (!hasUpperCase) || (!hasLowerCase) || (!given.matches(".*\\d+.*")));  
      {  
         System.out.println("That password is not acceptable.");  
         System.out.println("Enter your password:");  
         Scanner in2 = new Scanner(System.in);  
         given = in2.nextLine();  
         hasUpperCase = !given.equals(given.toLowerCase());  
         hasLowerCase = !given.equals(given.toUpperCase());        
      }  
      System.out.println("Acceptable password.");  
   }  
}  