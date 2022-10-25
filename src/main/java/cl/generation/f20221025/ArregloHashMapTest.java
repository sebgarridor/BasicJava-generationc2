package cl.generation.f20221025;

import java.util.HashMap;

public class ArregloHashMapTest {

	public static void main(String[] args) {
		// HashMap
		// llave, valor (key,value)
		HashMap<Integer, String> miembros = new HashMap<Integer, String>();
		
		// 2.- Agregar valores al map
		miembros.put(1, "Bárbara");
		miembros.put(2, "Brisa");
		miembros.put(3, "Gerald");
		miembros.put(4, "Fátima");
		miembros.put(4, "Fátima");
		miembros.put(1, "Sebastián"); //si existe esa clave, sobre escribe el valor
		System.out.println("Map "+ miembros);
		
		
		//3.- Tamaño del arreglo
		System.out.println(miembros.size());
		
		
		//4.-  Acceder a un dato
		miembros.get(3); //gerald
		System.out.println(miembros.get(3));
		
		// 5.- Eliminar un par de datos
		miembros.remove(2); //remueve el miembro que se le asignó la key "2".
		System.out.println("Map "+ miembros);
		
		
		// 6.- Cómo recorrer un map
		
		/*for (Map.Entry<I, valType> entry : map.entrySet()) { //for map se le denomina a este
			keyType key = entry.getKey();
			valType val = entry.getValue(); */
		
		for (Integer clave : miembros.keySet()) {
			
			System.out.println("La clave es " + clave + " valor" + miembros.get(clave));
			
		}
	}

}
