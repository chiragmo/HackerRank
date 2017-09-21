package test1;

import java.util.*;
import java.io.*;


public class HackerRank {
	  static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
		  int sum=0,x=0;
	        for(int i=0;i<n;i++)
	        {
	        	if(sum==ar[i])
	        	{
	        		x++;
	        	}
	        	if(sum<ar[i])
	        	{
	        		sum=ar[i];
	        		x=1;
	        	}
	        }
	        
	        return x;
	    }
	
	public static int[][] sb=new int[3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
	
}
}

package test1;

import java.util.*;
import java.io.*;


public class HackerRank {
	 static String timeConversion(String s) {
	        // Complete this function
		// if(s.substring())
	    }
	
	public static int[][] sb=new int[3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        /*String s = in.next();
	        String result = timeConversion(s);
	        System.out.println(result);*/
		 String s="07:05:45PM";
	        System.out.println(s.substring(8, 9));
}
}

