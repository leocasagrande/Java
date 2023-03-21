package Fix;

import java.util.Scanner;

import entities.Dolar;

public class Modulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor do dollar: ");
		Dolar.dollarPrice = sc.nextDouble();
		System.out.print("Informe a quantia que quer comprar de dollar: ");
		Dolar.dollarAmount = sc.nextDouble();

		System.out.print("Amount to be paid in reais = " + Dolar.AmountToPay());

		sc.close();
	}

}
