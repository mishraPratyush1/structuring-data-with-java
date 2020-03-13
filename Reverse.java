package chapter7;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
	
		ArrayList <Integer> a =new ArrayList<>();
		
		for (int i = 0; i < 3; i++) 
		{
			a.add((i+1)*2);
		}
		System.out.println(a);
		System.out.println("reversing");
		Collections.reverse(a);
		System.out.println(a);
		/*
		 * Iterator p=a.iterator()
		 * while(p.hasNext())
		 * 		print(p.next());
		 * */
		
		
	}

}
