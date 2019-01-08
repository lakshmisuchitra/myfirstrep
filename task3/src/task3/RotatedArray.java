package task3;

public class RotatedArray {
	String s1;
	String s2;

	public void isRotated(){
		String s11=new String("suchitra");
		String s21=new String("su");
		if(s11.contains(s21))
		{
		    s11 = s11.replace(s21,"");
			s11=s11+s21;
		}
		System.out.println(s11);
		
	}
	
public static void main(String[] args){
	RotatedArray obj=new RotatedArray();
	obj.isRotated();
}
}


