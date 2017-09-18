package test;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.*;
public class add {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            int max=0;
            int min=arr[0];
            for(int i=0;i<5;i++)
            {
            	int j=0;
            
            	while(j<5 && j!=i)
            	{
            	   total=total+arr[j];
            	}
            	if(total>max)
            	{
            		max=total;
            	}
            	if(total<min)
            	{
            		min=total;
            	}
            }
	
			
				        
	
				        
				    }
}

	


