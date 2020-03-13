package chapter7;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Scanner;


public class removeDuplicatesUsingSet {

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
		HashSet	<Integer>z =new HashSet<>(a); //LinkedHashSet removes duplicates from the set!!!!
		System.out.println("linked hash set");
		System.out.println(z);

	}

}
