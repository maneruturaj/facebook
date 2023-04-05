package tests;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 
{

	public static void main(String[] args) 
	{
		 HashSet<Integer> s = new HashSet<Integer>();
		
		s.add(56);
		s.add(89);
		s.add(76);
		s.add(87);
		s.add(65);
		
		for(int x : s)
		{
			System.out.println(x);
		}
		
		Iterator<Integer>  i = s.iterator();
			
		i.next();
		i.hasNext();
		for(int x : s) //by using while loop data retreval
		{
			System.out.println(i.next());
		}
		
		while(i.hasNext()) //by using while loop data retreval 
		{
			System.out.println(i.next());
		}
	}

}
