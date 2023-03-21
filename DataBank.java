package entities;
import java.util.Scanner;

public class DataBank {

	public static int accountNumber;
	public static String name;
	public static double initialValue;
	public static char yn;
	public static double update;


	public static double value() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much do you want to add? ");
		initialValue = sc.nextDouble();
		sc.close();
		
		return initialValue;
	}
	
		
	public static void simnao() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Is there an initial deposite? (y/n)");
		yn = sc.nextLine().charAt(0);
		
		if(yn == 'y') {
			value();
		}
		else {
			initialValue = 0;
		}
		
		sc.close();
		
	}
	
	
	public static void imprimir(){
		
		System.out.println("Account data: ");
		System.out.println("Account " + accountNumber + ", Holder: " + name + ", Balance: " + initialValue);
		
	}
	

	public static void Update() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want to add some money? (y/n)");
		yn = sc.nextLine().charAt(0);
		
		if(yn == 'y') {
			value();
		}
		else {
			imprimir();
		}
			
		sc.close();
	}
	
	
		
}
