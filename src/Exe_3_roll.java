/*rotem yehudai 208851204
 * oz benacot 315860213
 * AS 7 Exe 3
 */
import java.util.Scanner;
public class Exe_3_roll {
	public static Scanner input = new Scanner(System.in) ;
	public static void main(String[] args) {
		int max;
		boolean answer = true;
		   System.out.print("Enter the size of the arrays:");
		         max=input.nextInt();//enter size to array
		int[] arr1=new int[max];
		int[] arr2=new int[max];
		  
        for( int i=0;i<arr1.length;i++)//Puts numbers in an array 1
        {
        	 System.out.print("Enter number a "+(i+1)+"  for the first array:");
     	    arr1[i]=input.nextInt();
        }
           
        for(int k=0;k<arr2.length;k++)//Puts numbers in an array 2
        {
        	System.out.print("Enter  number a "+(k+1)+"  for the tow array:");
         	arr2[k]=input.nextInt();
        }
        
        for(int j=0 ; j< arr1.length;j++) 
   
        	if(j==0)//An extreme case that is in first place in the array
        		if( arr1[arr1.length-1]!=arr2[0]) //Checks if the numbers are even
        			answer=false;  //if not answer=false
        	
         	else
        	    if(arr1[j]!=arr2[j+1])
        	    	answer=false;
        
        	
        	System.out.print(answer);//print true/false
       
        	
        input.close();	 
	}

}
