/*rotem yehudai 208851204
 * oz benacot 315860213
 * AS 7 Exe 2
 */
import java.util.Scanner;
public class Exe_2_sum {
	public static Scanner input = new Scanner(System.in) ;
	public static void main(String[] args) {
		final int max=10,in=2;// max-Array size, in-The number of entries the user enters
		int[] arr=new int [max];//Establishment of an array
		int sum=0;
	   
	    for(int i=0;i<in;i++) {//Puts two numbers in an array and calculates their sum
	    	System.out.print("Enter a number "+ (1+i) +" for the array:");
	        arr[i]=input.nextInt();
	        sum+=arr[i];
	    }
	    for(int k=2;k<arr.length;k++)
	    {
	        arr[k]=sum;//Puts in the place after it the sum of the two before them
	        sum=sum+arr[k-1];//Calculates the new amount
	    }	
	    for(int i=0;i<arr.length;i++)//printes the array
	    	System.out.print(","+arr[i]);
	    input.close();
	    }    
	
		

	}


