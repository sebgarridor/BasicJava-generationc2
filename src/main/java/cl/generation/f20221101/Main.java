package cl.generation.f20221101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese su primera nota");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Ingrese su segunda nota");
		float nota2 = scanner.nextFloat();
		
		System.out.println("Ingrese su tercera nota");
		float nota3 = scanner.nextFloat();
		System.out.println("Ingrese su cuarta nota");
		float nota4 = scanner.nextFloat();
		
		promedio(nota1, nota2, nota3, nota4);
		
		scanner.close();
		
		
	}
	
	public static void promedio(float nota1, float nota2, float nota3, float nota4) {
		float sumaNotas = nota1 + nota2 + nota3 + nota4;
		float promedioNotas = sumaNotas / 4;
		System.out.println("El promedio de notas es :" + promedioNotas);
		
		
				
				
		
	}
	

	

}
