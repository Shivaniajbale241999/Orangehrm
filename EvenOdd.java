//Write a java program to print the even number or odd number and count the number of even number.
import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of your choice:");
		int a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("Even number.");
		}
		else
		{
			System.out.println("Odd number.");
		}
	}
}
