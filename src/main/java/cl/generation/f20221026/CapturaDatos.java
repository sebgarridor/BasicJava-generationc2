package cl.generation.f20221026;

import java.util.Scanner;

public class CapturaDatos {

	public static void main(String[] args) {
		
		Float imc = calculoIMC();
		System.out.println("El IMC del paciente es: " + imc);
		nivelIMC(imc);
		

	}

	public static Float calculoIMC() {
		// Capturar datos ingresados por el usuario.
		Scanner scanner = new Scanner(System.in);// Scanner nombreVariable = instancia. (System.in) indica un sistema de
													// entrada, de ingreso, de captura.
		// Calculo del IMC;
		// imc = kilos/(estatura*estatura);
		System.out.println("Ingrese su peso en kilogramos: ");
		Float peso = scanner.nextFloat();
		System.out.println("El peso del paciente es: " + peso);

		System.out.println("Ingrese su estatura en metros: ");
		Float estatura = scanner.nextFloat();
		System.out.println("La estatura del paciente es : " + estatura);

		Float imc = peso / (estatura * estatura);
		
		
		scanner.close(); // cerramos la variable scanner ya que consume memoria
		return imc;

	}
	
	public static void nivelIMC(Float imc) { //VALIDACIONES Y CONDICIONALES
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 */
		
		if(imc < 18.5f) {
			System.out.println("El paciente está bajo peso");
			
		} else if(imc >= 18.5f && imc < 25f){
			System.out.println("El paciente está en un rango normal");
			
		} else if(imc >= 25f && imc < 30f) {
			System.out.println("El paciente está sobre peso");
			
			
		} else {
			System.out.println("El paciente está obeso");
		}
		
		

		
	}

}
