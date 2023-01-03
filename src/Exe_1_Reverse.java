/*rotem yehudai 208851204
 * oz benacot 315860213
 * AS 7 Exe 1 
 */
import java.util.Scanner;
public class Exe_1_Reverse {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
    final int max=5;//Array size
    int[] arr1=new int [max];//Establishment of an array 1
    int[] arr2=new int [max];//Establishment of an array 2
    int count=max;
   
            for( int i=0;i<arr1.length;i++)// Inserts values ​​the first array
            {
            	System.out.print("Enter a number "+ (i+1) + " for the first array:");
                	arr1[i]=input.nextInt();
            }
        	 
            for(int k=0;k<arr2.length;k++)//Inserts values ​​the  two array
            {
            	System.out.print("Enter a number "+ (k+1)+ " for the two array:");
                 	arr2[k]=input.nextInt();
            }
            for( int j=0;j<max;j++)//A loop that checks whether the arrays are inverted
            {
            	if(arr1[j]==arr2[count-1])
            		count--;
            	else
            	  j=max;
            }
           if(count==0)//If the array is reversed the count is equal to 0
        	  System.out.print("The arrays are reversed");  
           else
        	  System.out.print("The arrays are not reversed");
            input.close();		
	}

}
