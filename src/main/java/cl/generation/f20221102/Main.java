package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		// Herencia en Java
		
		//Instanciando objetos
		Entrenador entrenador = new Entrenador();
		
		entrenador.setNombre("Walter");
		entrenador.setApellido("White");
		entrenador.setEdad(50);
		entrenador.setAniosExperiencia(15);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString()); //aquí sólo nos muestra sus dos atributos, no los heredados
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Saul");
		kine.setApellido("Goodman");
		kine.setEdad(42);
		kine.setEspecialidad("Músculos");
		kine.setEspecialidad("Kinesiologia");
		
		ArrayList<Basquetbolista> listaJugadores = new ArrayList<Basquetbolista>(); //creamos una lista de jugadores
		
		
		
		Basquetbolista basquetbolista = new Basquetbolista();
		basquetbolista.setNombre("Michael");
		basquetbolista.setApellido("Jordan");
		basquetbolista.setAltura(2.09f);
		
		listaJugadores.add(basquetbolista); //agregando un objeto a la lista al final de ella.
		
		Basquetbolista basquetbolista2 = new Basquetbolista();
		basquetbolista2.setNombre("LeBron");
		basquetbolista2.setApellido("James");
		basquetbolista2.setAltura(2.2f);
		
		listaJugadores.add(basquetbolista2);
		
		//recorrer lista
		
		for (Basquetbolista basquetbolista1 : listaJugadores) { // for(tipo de variable, nombre de variable : nombreArreglo)
			System.out.println(basquetbolista1.toString());
			
		}
		
		
		
		
		

	}

}
