package array;

public class Array {
    public static void main(String[] args)  {
       int[] array = {0,0,1,0,3,0,5,0,6};
        int i = 0;
	
		for (int n : array)
           System.out.print(n+"  ");
		
       for(int j = 0, l = array.length; j < l;) {
           if(array[j] == 0)
               j++;
           else {
               int tmp = array[i];
               array[i] = array[j];
               array[j] = tmp;
               i ++;
               j ++;
           }
       }
       while (i < array.length)
           array[i++] = 0;
       System.out.print("\nAfter moving 0's to the end of the array: \n");
       for (int n : array)
           System.out.print(n+"  ");
			System.out.print("\n");
   }
}
