package com.nnew.ggitt;
import java.util.*;
import java.lang.*;


class A 
{
	
	
	public static boolean checkOrder(String s)
	{
	boolean aboolean= false;
		
	//char[] ch = s.toCharArray();
	for(char ch:s.toCharArray())
	{
		if(ch=='b')
		{
			return true;
		}
		else
			if(ch=='b' && aboolean)
			{
			return false;
			}
		
	}
	
	return true;        
	
	
}
}
public class AComesBeforeB {
	
	public static void main(String[] args) {
		
		String s="aaabb";
		//System.out.println("this is aa");
		
		boolean b=A.checkOrder(s);
		
		if(b)
		{
			System.out.println("Valid if a comes before b");
		}
		else
		{
			System.out.println("Valid If A comes after B");
		

	}

}
}

