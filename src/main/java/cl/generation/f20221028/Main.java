package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//arreglo de estudiantes
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		int continuar = 2; //variable de control para ver si iniciamos o no el ciclo
		do {
			//crear instancia al objeto estudiante, esta instancia muere antes de entrar al while.
			
			System.out.println("Ingrese el nombre del estudiante: ");
			String nombre = sc.nextLine();// next vs nextline -> nextline lee toda la linea, guarda ambos.
			System.out.println("Ingrese el apellido del estudiante: ");
			String apellido = sc.nextLine();
			//Estudiante estudiante = new Estudiante (nombre, apellido);
			Estudiante estudiante = new Estudiante(); //creo una instancia de la clase estudiante
			//seteamos o modificamos un valor al atributo
			estudiante.setNombre(nombre); //asigno el scanner otorgado por el usuario para el constructor
			estudiante.setApellido(apellido);
			
			//agregar un objeto al arreglo con add
			estudiantes.add(estudiante); 
			
			
			System.out.println("Quiere agregar otro estudiante?");
			System.out.println("(1) Sí   (2) No");
			continuar = sc.nextInt();
			sc.nextLine(); //corrige el error de capturar un numero y despues solicitar un string
			
			
		} while (continuar==1 );
		System.out.println("*********************");
		for (Estudiante estudiante : estudiantes) { //(tipo de dato, variable : arreglo)
			System.out.println("Nombre:"+ estudiante.getNombre());
			System.out.println("Apellido:"+ estudiante.getApellido());
			System.out.println();
			System.out.println("*********************");
			
		}
		
		//Obtener un estudiante específico
		estudiantes.get(0).getApellido();
		System.out.println(estudiantes.get(0).getApellido());
		sc.close();
		
		
		
		
		
	}
	
	public static void capturarEstudiantes() {
		
		
		
	}

}
