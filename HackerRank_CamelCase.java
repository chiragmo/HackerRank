package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank_CamelCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "saveChangesInTheEditor";
		int x=0;
		if(s.isEmpty())
		{
			x=0;
			
		}
		else x=1;
		StringBuilder sb = new StringBuilder(s);
		
		//int x=1;
		
        for(int i=0;i<sb.length();i++)
        {
        	char c=sb.charAt(i);
        	int a=(int)c;
        	if(a>=65 && a<=90)
        	{
        		x++;
        	}
        }
		
		System.out.println(x);
		
	}
}