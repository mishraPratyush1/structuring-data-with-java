package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class reverseOrder 
{

	public static void main(String[] args) 
	{
		ArrayList <Integer> a =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 3; i++) 
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
		System.out.println("reverseorder and sorted");
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
	}

}
