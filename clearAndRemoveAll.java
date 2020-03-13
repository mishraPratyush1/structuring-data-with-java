package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class clearAndRemoveAll {

	public static void main(String[] args) 
	{
		ArrayList <Integer> a =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 5; i++) 
		{
			a.add(sc.nextInt());
		}
		System.out.println("arraylist:");
		System.out.println(a);
		
		ArrayList <Integer> b =new ArrayList<>();
		b.add(1);
		
		//This method takes collection c as a parameter containing elements to be removed from this list.		
		System.out.println("remove all");
		a.removeAll(b);
		System.out.println(a);
		
		//The clear() method of ArrayList in Java is used to remove all the elements from a list.
		System.out.println("clear");
		a.clear();
		System.out.println(a);
		sc.close();
		
		
	}

}
