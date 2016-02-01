import java.util.*;  
class PantryTester  
{  
   public static Scanner sc = new Scanner(System.in);  
     
   public static void main ( String[] args )  
   {  
      System.out.println("Welcome to Mother Hubbard's Pantry!\n\nThe jams are:");  
        
      Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );  
      Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );  
      Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );  
     
      Pantry hubbard = new Pantry( goose, apple, rhub );     
      hubbard.print();  
     
      int select = promptSelect();  
      int amount = promptAmount();  
        
      while(select != -1)  
      {  
         amount = promptAmount();  
        
         hubbard.select(select);  
         hubbard.spread(amount);  
         System.out.println("\nThe jams are: ");  
         hubbard.print();  
        
         select = promptSelect();  
      }  
   }       
   public static int promptSelect()  
   {  
      System.out.println("Enter your selection (1, 2, or 3): ");  
      return sc.nextInt();  
   }  
   public static int promptAmount()  
   {  
      System.out.println("Enter amount to spread: ");  
      return sc.nextInt();           
   }  
}  