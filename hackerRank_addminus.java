package test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class add {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				        Scanner in = new Scanner(System.in);
				        int n = in.nextInt();
				        int arr[] = new int[n];
				        for(int arr_i=0; arr_i < n; arr_i++){
				            arr[arr_i] = in.nextInt();
				            
				            
				        }
				       int sump=0;
				       int sumn=0;
				       int sumz=0;
				       for(int i=0;i<n;i++)
				       {
				    	   
				    	   if(arr[i]>0)
				    	   {
				    		   sump++;
				    		   
				    	   }
				    	   else if(arr[i]<0){
				    		   sumn++;
				    		
				    	   }
				    	   else
				    	   {
				    		   
				    		   sumz++; 
				    	
				    	   }
				    	
				       }
				       
				       float total1=((float)sump/(float)n);
				       
				       BigDecimal value1 = new BigDecimal(total1);
					      BigDecimal value11 = value1.setScale(6, RoundingMode.HALF_EVEN);
					       System.out.println(value11);
					       
					       
				       float total2=((float)sumn)/(float)n;
				       BigDecimal value2 = new BigDecimal(total2);
					      BigDecimal value21 = value2.setScale(6, RoundingMode.HALF_EVEN);
					       System.out.println(value21);
		
		float total3=((float)sumz)/(float)n;
				       
				       BigDecimal value3 = new BigDecimal(total3);
				      BigDecimal value31 = value3.setScale(6, RoundingMode.HALF_EVEN);
				       System.out.println(value31);
				        
				    }
}

	


