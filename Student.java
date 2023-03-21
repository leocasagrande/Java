package entities;

public class Student {

	public String name;
	public double a;
	public double b;
	public double c;
	
	
	public double grade(){		
		return a+b+c;
	}
	
	public double notaFalta() {
		
		return 60 - grade();
		
	}
	
	
}
