package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		
		
		// 1. - Definición de set o HashSet
		// HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> grupo3 = new HashSet<String>();

		// 2.- Agregar elementos al set, agrega datos de manera aleatoria y sin datos
		// duplicados/datos únicos.

		grupo3.add("Bárbara");
		grupo3.add("Sebastián");
		grupo3.add("Fátima");
		grupo3.add("Brisa");
		grupo3.add("Gerald");
		grupo3.add("Sebastián"); //no es agregado al tamaño del HashSet
		System.out.println(grupo3);

		// 3.- Verificar el contenido del arreglo

		boolean verificacionNombre = grupo3.contains("Sebastián"); // el comando contains("variable") nos retorna una
																	// respuesta booleana true o false.
		System.out.println("Existe el miembro? " + verificacionNombre);

		// 4.- Borrar un elemento del contenido

		grupo3.remove("Gerald"); // aquí hay que eliminar un OBJETO directamente mencionandolo, y no por su
									// posición como era en el ArrayList.
		System.out.println(grupo3); // ya no elimino por posición, sino que elimino por elemento/contenido.
		
		// 5.- Tamaño del arreglo
		
		System.out.println("El tamaño del HashSet es: " + grupo3.size());
		
		// 6.- Recorrer el arreglo
		
		for (String miembro: grupo3) { //recorremos el arreglo de la misma manera que un ArrayList
			System.out.println(miembro);
		}

	}

}
