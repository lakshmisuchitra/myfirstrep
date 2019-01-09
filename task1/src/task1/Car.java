package task1;

public class Car {
	int year;
	String name;
	double speed;

	public Car(int y,String n,double s){
		this.year = y;
		this.name = n;
		this.speed = s;
	}

	public double getSpeed(){
		return this.speed;
	}
	public String getName(){
		return this.name;
	}
	public int getYear(){
		return this.year;
	}

}
