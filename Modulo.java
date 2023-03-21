package Modulo;
import java.util.Scanner;

import entities.Student;

public class Modulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Student student;
		
		student = new Student();
		
		System.out.print("Informe o nome do aluno: ");
		student.name = sc.nextLine();
		System.out.print("Informe as três notas do aluno: ");
		student.a = sc.nextDouble();
		student.b = sc.nextDouble();
		student.c = sc.nextDouble();
		student.grade();
		
		if(student.grade() < 60) {
			System.out.print("ALUNO " + student.name +  " FAILED. NEEDS MORE " + student.notaFalta() + "POINTS");
		}
		else {
			System.out.print("ALUNO " + student.name +  " PASSES WITH " + student.grade());
		}
		
		
		sc.close();
	}


}
