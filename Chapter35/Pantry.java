import java.util.*;  
class Pantry  
{  
   // Instance Variables  
   private Jam  jar1 ;  
   private Jam  jar2 ;  
   private Jam  jar3 ;  
   private Jam  selected ;  
  
   // Constructors  
   Pantry( Jam jar1, Jam jar2, Jam jar3 )  
   {  
      this . jar1 = jar1 ;  
      this . jar2 = jar2 ;  
      this . jar3 = jar3 ;  
      selected = null ;  
   }  
     
   // Methods  
   public void print()  
   {  
      System.out.print("1: ");   
      jar1 . print() ;  
      System.out.print("2: ");   
      jar2 . print() ;  
      System.out.print("3: ");   
      jar3 . print() ;  
   }  
  
   // assume that the user entered a correct selection, 1, 2, or 3  
   public void select( int jarNumber )  
   {  
      if ( jarNumber == 1 )  
         selected =  jar1 ;  
        
      else if ( jarNumber == 2 )  
         selected = jar2 ;  
        
      else   
         selected = jar3 ;  
   }  
  
   // spread the selected jam  
   public void spread( int oz )  
   {  
      selected . spread( oz ) ;  
   }  

    public static void main ( String[] args )  
   {  
      Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );  
      Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );  
      Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );  
     
      Pantry2_MixedFruit hubbard = new Pantry2_MixedFruit( goose, apple );  
      hubbard.print();  
     
      if ( hubbard.select(3) )  
         hubbard.spread(2);  
      else  
         System.out.println("Selection not available");  
      hubbard.print();  
     
      hubbard.replace( rhub, 3 );  
      hubbard.print();  
     
      if ( hubbard.select(3) )  
         hubbard.spread(2);  
      else  
         System.out.println("Selection not available");  
      hubbard.print();  
        
   }  
}  
}  