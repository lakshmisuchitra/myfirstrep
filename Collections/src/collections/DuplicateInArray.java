package collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
public static void main(String[] args){
	int[] array = {1,1,2,3,4,5,6,7,8,8};
	Set<Integer> set = new HashSet<Integer>();
	for(int i=0; i < array.length; i++){
		if(set.add(array[i])==false){
			System.out.println("Duplicate element found: " +array[i]);
		}
	}
}
	
}
