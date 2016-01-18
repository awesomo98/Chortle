

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
  
  int average() {
	  int sum = 0;
	  for (int i = 0; i < data.length; i++)
		  sum += data[i];
	  return sum / data.length;
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