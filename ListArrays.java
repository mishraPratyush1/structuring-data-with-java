package chapter7;
import java.util.ArrayList;
import java.util.Scanner;
public class ListArrays {

	public static void main(String[] args) 
	{
		ArrayList <String> a = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of arraylist.");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) 
			a.add(sc.next());
		
		System.out.println(a);
		System.out.println("size of arrayList = "+a.size());
		
		System.out.println("index to change:");
		int index=sc.nextInt();
		System.out.println("enter the new value");
		String value=sc.next(); 
		
		a.set(index, value); //replaces the element at an index by a new value
		
		System.out.println(a);
		System.out.println("enter the index to be removed.\n");
		int k=sc.nextInt();
		
		if(k>n)
			System.err.println("sorry can\'t be removed..");
		else
			System.out.println(a.remove(k));
		
		System.out.println("new arraylist:\n "+a);
		
		System.out.println("\nremoving the elements....");
		a.clear();
		
		sc.close();
	}

}
