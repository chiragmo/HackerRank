/** 
$Project: Insertion-Sort Algorithm Implementation  
It makes the order of sorting in descending order

Author: Chirag Mahadevanapura Onkarappa
       email: chiragmo2016@gmail.com

License: Read-only, No publication or usage in any form.
**/
package test; //Hacker Rank Diagonal Difference by vatsalchanan 08/29/2017
import java.util.*;
public class HackerRank_DiagonalDifference { 
 
	public static void main(String[] args) {
		

		
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	            }
	         }
	        int sumPri=0;
	        int sumSec=0;
	        int Total=0;
	        //primary diagonal
	        for(int i=0;i<n;i++)
	        {
	        sumPri=sumPri+a[i][i];
	        }
	        int j=0;
	        for(int i=n-1;i>=0;i--)
	        {
	        sumSec=sumSec+a[j][i];
	        j++;
	        } 
			Total=sumPri-sumSec;
			if(Total<0)
			{
			Total=Total-Total-Total;
			}
			int total=Total;
	        System.out.println(total);   
	        //System.out.println("Primary:"+sumSec);
}
}



