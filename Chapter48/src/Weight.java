

class Weight
{
  int[] data;
  
  // Constructor
  Weight(int[] init)
  {
    
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < data.length; j++)
    {
      data[j] = init[j];
    }
  }
  
  //Print
  void print()
  {
//	  int count = 0;
	  for (int j = 0; j < data.length; j++) {
		  System.out.print(data[j] + " ");
//		  count++;
	  }
 
  }
}      