package modulo;

import java.util.Scanner;

import entities.DataBank;

public class modulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");	
		DataBank.accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		DataBank.name = sc.next();
		
		DataBank.simnao();
		
		DataBank.imprimir();
		
//		DataBank.Update();
		
		sc.close();
	}

}
