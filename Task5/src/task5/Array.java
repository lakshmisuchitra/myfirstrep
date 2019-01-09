package task5;

import java.util.Arrays;

public class Array {
	public static void main(String []args){
		int i=0;
		int j;
		int temp;
		
		int[] array1={1,2,3,4,5};
		int[] array2={6,7,8,9,10};
		int length= array1.length + array2.length;
		int[] result=new int[length];
		int pos=0;
		for(int element:array2){
			result[pos]=element;
			pos++;
		}
		for(int element:array1){
			result[pos]=element;
			pos++;
		}
		System.out.println(Arrays.toString(result));
		
		for( i = 0;i< result.length;i++)
		{
			for(j=i+1;j<result.length;j++){
				if(result[i]>result[j]){
				temp=result[i];
				result[i]=result[j];
				result[j]=temp;
			}
			}}
		System.out.print("\nAscending Order:");
        for (int k = 0; k < result.length - 1; k++) 
        {
            System.out.print(result[k] + ",");
        }
        System.out.print(result[length-1]);
    }
		
	
}
	

