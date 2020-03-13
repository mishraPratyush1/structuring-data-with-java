package chapter7;
import java.util.Scanner;

public class arrayStart 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements:");
		int n=sc.nextInt();
		int []a=new int[n];
		
		System.out.println("enter the elements:");
		for (int i = 0; i < a.length; i++) 
			a[i]=sc.nextInt();
		
		System.out.println("\ndisplaying the values:");
		for (int i :a) 
			System.out.print(i+" ");
		
		System.out.println("\nenter the new size of array:");
		int m=sc.nextInt();
		
		a=new int[m]; //redeclaring the size of array:
		System.out.println("enter the elements:");
		for (int i = 0; i < a.length; i++) 
			a[i]=sc.nextInt();
		
		System.out.println("\ndisplaying the values:");
		for(int i:a) 
			System.out.print(i+" ");
		
		sc.close();
	}

}
