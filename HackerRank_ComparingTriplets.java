package test1;

import java.util.*;
import java.io.*;


public class HackerRank {

	  static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
	        // Complete this function
	        int sum1 = 0, sum2=0;
	        int[] arr1=new int[3];
	        int[] arr2=new int [3];
	        int[] arr=new int[2];
	        arr1[0]=a0;
	        arr1[1]=a1;
	        arr1[2]=a2;
	        arr2[0]=b0;
	        arr2[1]=b1;
	        arr2[2]=b2;
	        for(int i=0;i<3;i++)
	        {
	        	if(arr1[i]>arr2[i])
	        	{
	        		sum1++;
	        	}
	        	else if(arr1[i]<arr2[i])
	        	{
	        		sum2++;
	        	}
	        	
	        }
	        arr[0]=sum1;
	        arr[1]=sum2;
	        
			return arr;
	        
	    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        /*for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }*/
        System.out.println("");
		
}
}

