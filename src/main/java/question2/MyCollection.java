package question2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Please implement Dynamic Array Interface
 * 
 * @author
 *
 */
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private String[] numArray;
	
	
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
	
	}

	public int search(String searchingNum) {
		// TODO Auto-generated method stub
		int arraySize=numArray.length;
		System.out.println("ärray size is"+arraySize);
		for(int i=0;i<arraySize;i++)
		{
			System.out.println(numArray[i]);

		}
		int c=0;
	
		 for ( c = 0; c < arraySize; c++)
		    {
		      if (numArray[c] == searchingNum)     /* Searching element is present */
		      {
		         System.out.println(searchingNum + " is present at location " + (c + 1) + "."); 
		      break;
		      }
		   }
		   if (c == arraySize) {  /* Element to search isn't present */
		      System.out.println(searchingNum + " isn't present in array.");
		      return -1;
		   }
		   return c;
	}
	
	
	public boolean add(String numberToAdd) {
		// TODO Auto-generated method stub
		int arraySize=numArray.length;
		
	int result_search=	search(numberToAdd);
		if(result_search==-1)
		{
			for(int i=0;i<arraySize;i++)
			{
				if(numArray[i]==null)
				{
					numArray[i]=numberToAdd;
					break;
				}
			}
			for(int i=0;i<arraySize;i++)
			{
				System.out.println(numArray[i]);

			}
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	public void doubleCapacity() {
		

	}

	public boolean remove(String numberToRemove) {
		// TODO Auto-generated method stub
		int arraySize=numArray.length;		
		int result_search=	search(numberToRemove);
		if(result_search!=-1)
		{
			 for(int i = result_search+1; i < arraySize; i++)
	            {
	                numArray[i-1] = numArray[i];
	            }
			 for(int i=0;i<arraySize;i++)
				{
					System.out.println(numArray[i]);

				}

		}
		else
		{
			return false;
		}
		return true;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		int arraySize=numArray.length;	
		return arraySize;
	}

	public String[] rotate(int n) {
		// TODO Auto-generated method stub
		int arraySize=numArray.length;	
		 for (int i = 0; i < n; i++)
		 {
			 String temp = numArray[0];
			 int k;
			   for ( k = 0; k < arraySize-1; k++)
			       numArray[k] = numArray[k+1];
			    
			   numArray[k] = temp;
		 }
		 for(int i=0;i<n;i++)
			{
				System.out.println("(((((((((("+numArray[i]);

			}
		/* System.out.println(arraySize + "****************");
			String result="{";
			for(int  i = 0;i<numArray.length;i++) {
				if(numArray[i] != null) {
					if(i != arraySize-1) {
						result+= numArray[i] + ",";
					}
					else {
						result+= numArray[i];
					}
				}
			}
			result +=   "}";*/
			return numArray;
	}
public String toString()
{
	int arraySize=numArray.length;	
	String result="{";
	System.out.println(arraySize + "****************");
	for(int  i = 0;i<numArray.length;i++) {
		if(numArray[i] != null) {
			if(i != arraySize-1) {
				result+= numArray[i] + ",";
			}
			else {
				result+= numArray[i];
			}
		}
	}
	result +=   "}";
	return result;
}
}
