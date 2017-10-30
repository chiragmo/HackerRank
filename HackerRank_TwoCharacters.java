package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HackerRank_TwoCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "beabeefeab";
		StringBuilder sb=new StringBuilder(s);
		ArrayList<String> arl=new ArrayList<String>();
		arl.add(Character.toString(sb.charAt(0)));
		int j=0;
		int flag=0;
		for(int i=1;i<s.length();i++)
		{
			for(int k=0;k<arl.size();k++)
			{
				if(!Character.toString(sb.charAt(i)).equals(arl.get(k)))
				{
					flag++;
				}
			}
			if(flag==arl.size())
			{
				arl.add(Character.toString(sb.charAt(i)));
				
			}
			flag=0;
		}
		//System.out.println(arl);
		ArrayList<String> ar_1=new ArrayList<String>();
		ArrayList<String> ar_2=new ArrayList<String>();
		ArrayList<String> arli=new ArrayList<String>();
		ArrayList<String> arlist=new ArrayList<String>();
		for(int i=0;i<arl.size();i++)
		{
			for(int k=i+1;k<arl.size();k++)
			{
				ar_1.add(arl.get(i));
				ar_2.add(arl.get(k));
			}
		}
		//System.out.println(ar_1);
		//System.out.println(ar_2);
		for(int i=0;i<ar_1.size();i++)
		{
			String s1="";
			for(int k=0;k<sb.length();k++)
			{
				if(Character.toString(sb.charAt(k)).equals(ar_1.get(i))  ||  Character.toString(sb.charAt(k)).equals(ar_2.get(i)))
				{
					s1=s1+Character.toString(sb.charAt(k));
				}
			}
			arli.add(s1);
			//System.out.println("without: "+ar_1.get(i)+"  and "+ar_2.get(i)+"  = "+s1);
		}

		//System.out.println(arli);
		int f=0;
		for(int i=0;i<arli.size();i++)
		{
			String s3=arli.get(i);
			StringBuilder sb1=new StringBuilder(s3);
			for(int k=0;k<s3.length()-2;k++)
			{
				if(sb1.charAt(k)!=sb1.charAt(k+2))
				{
					f=1;
				}
			}
			if(f==0)
			{
				arlist.add(s3);
				//System.out.println(s3);
			}
			f=0;
		}
		int temp=0;
		for(int i=0;i<arlist.size();i++)
		{
			String s4=arlist.get(i);
			 
			if(s4.length()>temp && s4.length()>2)
			{
				temp=s4.length();
			}
		}
		System.out.print(temp);
	}
}