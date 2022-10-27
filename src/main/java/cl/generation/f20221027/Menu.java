package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		menu();
		// Crear menu de opciones para que el usuario decida que hacer
		// terminar la ejecución
		
		

		
		
		
		// Calculadora con 4 operaciones básicas
		// Solicitaremos 2 números float o double
		
		// Imprimir resultados
		// Ofrecer al usuario si desea realizar otra operación (bucles)
		// Definir los métodos.
		// Validaciones
		// limpiar las variables
		
		
		
		

	}
	
	
	public static void menu() {
		System.out.println("*************************");
		System.out.println("  MENU DE OPERACIONES");
		System.out.println("*************************");
		System.out.println(" 1·    Suma                ");
		System.out.println(" 2·    Resta               ");
		System.out.println(" 3·    Multiplicación              ");
		System.out.println(" 4·    División                ");
		System.out.println(" 0·    Salir                ");
		System.out.println("*************************");
		
		
		Scanner scanner = new Scanner (System.in);
		int opciones = 0;
		int contadorErrores = 4;
		
		
		do {
			System.out.println("- Seleccione una opción -");
			
			opciones = scanner.nextInt();
			
			
			
			//si la opción es 0, salir del doWhile
			
			if(opciones==0) { //termina el programa cuando el usuario digita el numero 0
				System.out.println("Usted ha salido del programa");
				break;
				
			} if(opciones < 0 || opciones > 4){ //condición de error, cuando esto sucede ahí descuenta. es condición de error cuando el usuario ingresa un numero menor a 0 y mayor a 4
				contadorErrores--; //estamos bajando la variable del contador, la cual la definimos como 4 intentos.
				System.out.println("Te quedan "+contadorErrores+ " intentos");
				
			}
			
			
			if(contadorErrores==0) { // ESTE ES PARA SABER CUANTAS VECES SE ESTÁ EQUIVOCANDO.
				System.out.println("Agotó la cantidad de intentos");
				break;
				
				
			}
			
		} while (opciones < 0 || opciones > 4);
		
		
		
		if(opciones ==0 || contadorErrores==0) { //son dos maneras de salir del programa, si alguna de las dos condiciones se cumple, termina.
			System.out.println("Goodbye");
			
		}else { //solo ingresara para opciones 1 / 2 / 3 / 4
			//solicitar 2 números al usuario
			System.out.println("Ingrese el primer número");
			float numero1 = scanner.nextFloat();
			System.out.println("Ingrese el segundo número");
			float numero2 = scanner.nextFloat();
			
			float resultado = 0;
			
			
			switch (opciones) {
			case 1: //SUMA
				resultado = numero1 + numero2;
				System.out.println("El resultado es "+ resultado);
				
				break;
			case 2: //resta
				resultado = numero1 - numero2;
				System.out.println("El resultado es "+ resultado);
				
				break;
			case 3: //multiplicación
				resultado = numero1 * numero2;
				System.out.println("El resultado es "+ resultado);
				break;
			case 4: //division
				if(numero1==0 || numero2==0) {
					System.out.println("No se puede dividir por cero");
					
				}else {
					resultado = numero1 / numero2;
					System.out.println("El resultado es "+ resultado);
				}
				break;	

			default:
				System.out.println("Opción no válida");
				break;
			}
			
		}
	}
	

}
