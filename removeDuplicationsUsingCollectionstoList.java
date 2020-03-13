package chapter7;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
public class removeDuplicationsUsingCollectionstoList {

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
		
		List <Integer> k = a.stream().distinct().collect(Collectors.toList());
	    System.out.println(k);
		
	
	}

}
