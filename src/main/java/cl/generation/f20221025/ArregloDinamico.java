package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {

		// 1.- Definición = ArrayList: arreglo donde no hay que definir un tamaño en su
		// creación, se pueden agregar/quitar elementos cuando sea.
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> grupo3 = new ArrayList<String>();

		// 2.- Agregar valores al arreglo con .add()
		grupo3.add("Fátima");
		grupo3.add("Gerald");
		grupo3.add("Brisa");
		grupo3.add("Sebastián");
		grupo3.add("Bárbara");

		System.out.println(grupo3);

		// 3.- Tamaño del ArrayList

		System.out.println(grupo3.size()); // size(); para conocer el length del ArrayList.
											// size para elementos dinámicos, length para estáticos.

		// 4.- Obtener un elemento dentro del arreglo

		System.out.println(grupo3.get(4)); // get(posición); para obtener un elemento en X posición.

		// 5.- Eliminar // remove(); para eliminar un elemento dentro del ArrayList, el
		// resto de los elementos se corren.

		grupo3.remove(2);
		System.out.println(grupo3);

		// 6.- Recorrer el ArrayList con un ciclo for
		for (int i = 0; i < grupo3.size(); i++) {
			System.out.println("Miembro: " + grupo3.get(i)); // para obtener todos los valores dentro del arreglo
																// debemos usar el comando .get(i);

		}
		System.out.println("***********");

		// 7.- for iterador o for de objeto

		for (String miembro : grupo3) { // for(TIPODEDATO individual: nombreArreglo){} individual = subcategoría del
										// arreglo. EJ: de números -> número. esta subcategoría nace y muere dentro de este loop
			System.out.println(miembro);

		}

	}

}
