/*rotem yehudai 208851204
 * oz benacot 315860213
 * AS 7 Exe 4
 */
import java.util.Scanner;

public class Exe_4_MirrorCollection 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int size ;
		System.out.print("Enter an even size for the array:");
		 size=input.nextInt();//enter a size even
		int[] arr = new int[size];
		for(int i = 0; i < arr.length ; i++)// loop to fill the array
		{
			System.out.printf("Enter number %d from %d: ",i+1, arr.length);
			arr[i]= input.nextInt();
		}
		if(ifMirrorArray(arr))// Function that check if the array is mirror array
			System.out.print("This arrey is mirror array");
		else
			System.out.print("This arrey is not mirror array");
		input.close();
	}
	public static int flipNum(int userNum)// function that get a number and return the flip number
	{
		int newNum=0;
		while(userNum != 0)
		{
			newNum = newNum*10 + userNum%10;
			userNum = userNum/10;
		}
		return newNum;
	}
	public static boolean ifIsMirror(int num1, int num2)// function that get a number and return the flip number
	{
		boolean isMirror;
		if(num1 < 0 || num2 < 0)// checking if one of the numbers is negative
		{
			return isMirror = false;
		}
		isMirror = num1 == flipNum(num2)?true:false; // checking if number1 is equal to the flip number2
		return isMirror;
	}
	public static boolean ifMirrorArray(int[] arr)// function that get an array and return if its a mirror array
	{
		for(int i = 0; i<arr.length/2;i++)
		{
			if(ifIsMirror(arr[i], arr[arr.length-i-1]) == false)
			{
				return false;
			}
			
		}
		return true;
	}


}


