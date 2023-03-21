package segundoEx;

import java.util.Scanner;

import entities.Product;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Stock: ");
		product.stock = sc.nextInt();

		System.out.println("Product data: " + product);

		System.out.print("Adicione um numero de produtos: ");
		int stock = sc.nextInt();
		product.addProduto(stock);
		System.out.println("Updated data: " + product);

		System.out.println("Apague um numero de produtos: ");
		stock = sc.nextInt();
		product.removeProduto(stock);
		System.out.println("Final data: " + product);

		sc.close();
	}

}
