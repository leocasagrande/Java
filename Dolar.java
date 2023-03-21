package entities;

public class Dolar {

	public static double dollarPrice; 
	public static double dollarAmount;
	
	
	public static double AmountToPay(){
		return ((dollarPrice * dollarAmount) * 0.06) + (dollarPrice * dollarAmount);
	}
	
}
