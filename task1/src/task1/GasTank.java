package task1;

public class GasTank {
	static double amount=0;
	public double addGas(double addgas){
		
		amount=amount+addgas;
		return amount;
	}
	
	public double useGas(double usegas){
		amount=amount-usegas;
		return amount;
	
	}
	public double getGasLevel(){
		return amount;
		
	}

	}

