package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// do while loop
		// A lo menos se ejecuta una vez el primer statement
		Scanner scanner = new Scanner(System.in);
		int edad = 0; //en algunso casos la variable va afuera del loop para que tenga un contexto globa.
		float kilos = 0;
		float estatura = 0;
		
		
		//SOLICITAR NOMBRE Y APELLIDO. GENERAR UN MENSAJE QUE DIGA: EL PACIENTE X,X DE EDAD Y, DE ESTATURA Z, DE PESO V ESTÁ CON SOBREPESO.
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = scanner.next();
		
		
		
		
		do {
			System.out.println("Ingrese su edad");
			edad = scanner.nextInt(); //scaneamos una variable de tipo int ya que lo asociamos a la variable que está fuera del dowhile.
			
		} while (edad < 18 || edad > 120); //mientras la condición sea verdadera, el ciclo se repetirá infinitas veces.
		
		System.out.println("Edad ingresada es: "+edad);
		
		//
		do {
			System.out.println("Ingresa tu peso");
			kilos = scanner.nextFloat();
			
		} while (kilos < 40 || kilos >300);
		
		System.out.println("El peso ingresado es: "+ kilos);
		
		
		do {
			System.out.println("Ingresa tu estatura");
			estatura = scanner.nextFloat();
		} while (estatura < 1.01 || estatura >3.00);
		
		System.out.println("La estatura ingresada es" + estatura);
		
		
		
		
		scanner.close();
	}

}
