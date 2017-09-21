package test1;

import java.util.*;
import java.io.*;


public class HackerRank {
	static String timeConversion(String s) {
        // Complete this function
       if(s.substring(8,10).equals("AM"))
       {
    	if(s.substring(0,2).equals("12")) 
    	{
    		return "00"+s.substring(2,8);	
    	}
    	else return s.substring(0,8);
       }
       
       
       
       else if(s.substring(8,10).equals("PM")  )
       {
       int a=Integer.parseInt(s.substring(0,2));
       if(s.substring(0,2).equals("12")) 
   	{
   		return "12"+s.substring(2,8);	
   	}
       else
       {
       a=(a+12);
       String s1=Integer.toString(a);
       return s1+s.substring(2,8); 
       }
       
    	   
       //return s.substring(2,8);
	
    }
       return "0";
	}
	public static int[][] sb=new int[3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        //String s = in.next();
	        String s="12:45:54PM";
	        String result = timeConversion(s);
	        System.out.println(result);
		
}
}

