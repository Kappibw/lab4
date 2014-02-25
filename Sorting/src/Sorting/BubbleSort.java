package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] num) {
		//TODO: S1 implements bubble sort
		 int j;
	     boolean flag = true;  
	     int temp; 

	     while ( flag )
	     {
		    flag= false;    
		    for( j=0;  j < num.length -1;  j++ )
		    {
		           if ( num[ j ] < num[j+1] )   
		           {
		                   temp = num[ j ];               
		                   num[ j ] = num[ j+1 ];
		                   num[ j+1 ] = temp;
		                  flag = true;              
		          } 
		    } 
	      } 
		return num;
	}
}
