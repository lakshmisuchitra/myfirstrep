package task3;
import java.io.*;

public class PlusOne {
	 
	    void sum(int[] arr, int n) 
	    { 
	        int i = n; 
	  
	       
	        if (arr[i] < 9) { 
	            arr[i] = arr[i] + 1; 
	            return; 
	        } 
	  
	       
	        arr[i] = 0; 
	        i--; 
	  
	        
	        sum(arr, i); 
	  
	      
	        if (arr[0] > 0) 
	            System.out.print(arr[0] + ", "); 
	  
	        
	        for (i = 1; i <= n; i++) { 
	            System.out.print(arr[i]); 
	  
	            if (i < n) 
	                System.out.print(", "); 
	        } 
	    } 
	  
	
	    static public void main(String[] args) 
	    { 
	    	PlusOne obj = new PlusOne(); 
	          
	         
	        int n = 2; 
	  
	       
	        int[] arr = { 1,2,9}; 
	  
	        
	        obj.sum(arr, n); 
	    } 
	} 


