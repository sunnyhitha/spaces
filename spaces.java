/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextLine();
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			
			 if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			
		}
	
		System.out.println(space);
	
	}
}
