package task3;
import java.util.*;
public class Permutation {

static boolean permutation(String s1, String s2){
	int n1=s1.length();

	int n2=s2.length();
	if(n1 != n2)
return false;
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	for(int i=0; i<n1; i++)
		if(ch1[i]!=ch2[i])
			return false;
	return true;

}
public static void main(String[] args){
	String s1="suchi";
	String s2="chuisa";
	if(permutation(s1,s2))
		System.out.println("yes");
	else
		System.out.println("No");
}

}
