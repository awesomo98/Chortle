class Mix  
{  
   // Instance Variables  
   private Jam  jar1 ;  
   private Jam  jar2 ;  
   private Jam  jar3 ;  
   private Jam  selected ;  
  
   // Constructors  
   Mix( Jam jar1)  
   {  
      this . jar1 = jar1 ;  
      this . jar2 = null ;  
      this . jar3 = null ;  
      selected = null ;  
   }  
   Mix( Jam jar1, Jam jar2)  
   {  
      this . jar1 = jar1 ;  
      this . jar2 = jar2 ;  
      this . jar3 = null ;  
      selected = null ;  
   }  
   Mix( Jam jar1, Jam jar2, Jam jar3 )  
   {  
      this . jar1 = jar1 ;  
      this . jar2 = jar2 ;  
      this . jar3 = jar3 ;  
      selected = null ;  
   }  
     
   // Methods  
   public void print()  
   {  
      int num = 1;  
      if(jar1 != null)  
      {  
         System.out.print(num+": ");   
         jar1 . print() ;  
         num++;  
      }  
      if(jar2 != null)  
      {  
         System.out.print(num+": ");   
         jar2 . print() ;  
         num++;  
      }  
      if(jar3 != null)  
      {  
         System.out.print(num+": ");   
         jar3 . print() ;  
         num++;  
      }   
   }  
  
   // assume that the user entered a correct selection, 1, 2, or 3  
   public boolean select( int jarNumber )  
   {  
      if ( jarNumber == 1 )  
      {  
         selected = jar1;  
         return(jar1 != null) ;  
      }  
      else if ( jarNumber == 2 )  
      {  
         selected = jar2;  
         return(jar2 != null) ;  
      }  
      else   
      {  
         selected = jar3;  
         return(jar3 != null) ;  
      }  
   }  
  
   // spread the selected jam  
   public void spread( int oz )  
   {  
      selected . spread( oz ) ;  
   }  
     
   public void replace(Jam j, int slot)  
   {  
      switch(slot)  
      {  
         case 1: jar1 = j;  
         case 2: jar2 = j;  
         case 3: jar3 = j;  
      }        
   }  
   public void mixedFruit()  
   {  
      if(jar1.capacity<=2 && jar2.capacity<=2 && jar3.capacity<=2)  
      {  
         jar1.capacity = jar1.capacity + jar2.capacity + jar3.capacity;  
         jar1.contents = "Mixed Fruit";  
      }  
   }  
}  