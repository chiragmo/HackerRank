package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank_SuperReducedString {


		    public static void main(String []args){
		    	Scanner scan=new Scanner(System.in);
		     String s="aaabccddd";
		     StringBuilder sb = new StringBuilder(s);
		     ArrayList<String> al = new ArrayList<String>();
		     for(int i=0;i<s.length();i++)
		     {
		    	 char c=sb.charAt(i);
		    	al.add(i, Character.toString(c ));
		     }
		     int flag=0;
		     int i=0;
		    // System.out.println(al);
		     //for(;i<al.size()-1;)
		     while(i<(al.size()-1)) //n
		     {
		    	 //System.out.println("value of i: "+i+"  and size of "+ al.size());
		    	 if(al.get(i).equals(al.get(i+1)))
		    	 {
		    		 al.remove(i); //n
		    		 al.remove(i);
		    		 flag=1;
		    		 
		    		 //System.out.println(al.size());
		    		 i=0;
		    	 }
		    	 i++;
		    	 if(flag==1)
		    	 {
		    		 i=0;
		    		 flag=0;
		    	 }
		     }
		     String s1="";
		     for(int k=0;k<al.size();k++)
		     {
		    	 s1=s1+al.get(k);
		     }
		     if(s1.equals(""))
		     {
		    	 System.out.println("Empty String");
		     }
		     else System.out.println(s1);
		    	  		    }
}