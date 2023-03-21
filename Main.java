import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {	
				Scanner sc = new Scanner(System.in);
				
				Triangle x, y;
				
				x = new Triangle();
				y = new Triangle();
				
				System.out.println("Digite os valores do triangulo X: ");
				x.a = sc.nextDouble();
				x.b = sc.nextDouble();
				x.c = sc.nextDouble();
				
				System.out.println("Digite os valores do triangulo Y: ");
				y.a = sc.nextDouble();
				y.b = sc.nextDouble();
				y.c = sc.nextDouble();
				
				
				double areaX = x.area();				
				double areaY = y.area();
				
				if(areaX > areaY) {
					System.out.println("Area de X é maior");
				}
				else {
					System.out.println("Area de Y é maior");
				}
				
				
				sc.close();
	}

}
