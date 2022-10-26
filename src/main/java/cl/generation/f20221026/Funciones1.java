package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// Funciones o método, utilizaremos el método main para llamar a otras funciones
		
		//llamar a un método
		
		nombreMetodo();
		metodo2("Sebastián");
		metodo2("Garrido");//cada vez que llamen al método tiene que pasar un string, si pasa un int tira
							// error.
		metodo3(25);
		metodo4(77, 9.9f); // aquí solicitod los dígitos que pedí en el public static void metodo4(Integer,
							// Float)
		String[] arreglito = { "a", "e", "i", "o", "u" }; // aquí recién estoy creando el arreglo. ya estaba el formato
															// pero no lo reconocía
		metodo5(arreglito);
		String nombreCompleto = obtenerNombreCompleto("Sebastián", "Garrido", "Ramírez"); // estoy pasando como
																							// argumento tres strings,
																							// yo le otorgo la
																							// información dentro del
																							// parametro.
		System.out.println("El nombre completo es: " + nombreCompleto);

		// metodos con retornos/llamados
		// retorno1();//no hace nada con el valor retornado
		System.out.println(retorno1());
		Integer valorRetornado = retorno1(); // asignamos a una nueva variable de tipo integer llamada valorRetornado el
												// valor retornado del método.
		System.out.println(valorRetornado / 7); //

	}

	// definición o estructura de un método
	public static void nombreMetodo() { // PUBLIC: nos permite acceder desde cualquier lugar, no es restrictivo
										// STATIC : no instanciar.
										// VOID = nuestro método no retorna ningún valor, el método sólo se encarga de
										// realizar su acción.

		System.out.println("Estoy dentro del método inicial");

	}

	public static void metodo2(String nombre) { // defino el tipo de dato String, el parametro es solo una nueva
												// variable.
		System.out.println("Yo soy " + nombre);
	}

	public static void metodo3(Integer numero1) { // solicito un numero INTEGER cada vez que sea llamado, no tiene
													// límites al exigir contenido
		System.out.println("Mi edad es " + numero1); // numero indica el CONTENIDO.

	}

	public static void metodo4(Integer numero1, Float numero2) { // aquí solicito dos dígitos, primero un número integer
																	// y después un número float
		System.out.println("Soy el número " + numero1);
		System.out.println("Soy el número " + numero2);
	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito)); // es necesario usar el Arrays.toString para
																			// lograr imprimir el arreglo, de lo
																			// contrario sólo imprime la memoria

	}

	// FUNCIONES CON RETORNO

	public static Integer retorno1() { // cambiamos el void por el tipo de dato que queremos retornar. VOID IMPLICABA
										// QUE NO HABÍA RETORNO.
		Integer totalAlumnos = 35; // creamos variable Integer
		return totalAlumnos;// le pido que me retorne el valor de la variable Integer
	}

	/**
	 * Método que une todos los datos
	 * 
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @return nombreCompleto
	 */
	public static String obtenerNombreCompleto(String nombre, String apellidoPaterno, String apellidoMaterno) { //da lo mismo el orden en que reciba los datos
		String nombreCompleto = nombre + " " + apellidoPaterno + " " + apellidoMaterno; //aquí importa el orden que le otorgue a los datos

		return nombreCompleto; // retornamos el contenido de la variable creada llamada nombreCompleto

	}

}
