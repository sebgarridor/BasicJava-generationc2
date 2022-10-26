package cl.generation.f202221024;
//debajo de package importamos algunas librerias

public class Main {

	public static void main(String[] args) {
		// HAY QUE ESTABLECER EL TIPO DE DATO EN VARIABLES PARA JAVA.
		// en JS era: nombre_variable
		
		//tendremos tipo de variables según su género.
		//variables primitivas
		int numero1 = 2; //variable númerica, para números enteros
		
		long numero2 = 2484884891212l; //número mucho más grande que un número int.
		
		float decimal = 2.5f; // float para núm. decimales
		
		float decimal2 = (float) 5.5; //castear
		
		double decimal3 = 9.8d; // el doble de grande que un float
		
		char caracter = '4'; //diferencia entre un string y un caracter es como se escribe, en comillas simples es un caracter, con comillas dobles es string
								//siempre debe ir en comillas simples Y ES UN SOLO CARACTER (A, X, Y, 9, ETC.)
		
		boolean respuesta = true; //también puede ser false.
		
		//short y byte
		//byte = stores whole numbers from -128 to 127
		//short = stores whole numbers from -32,768 to 32,767
		
		System.out.println(numero1+"| "+numero2+"| "+decimal+"| "+ decimal2); //concatenando strings con variables numéricas
		System.out.println(decimal3+"| "+caracter+"| "+respuesta);
		
		
		//dato no primitivo
		String palabra = "qwerty"; //en variables primitivas, es la única manera de trabajar con variables primitivas
									// son cadenas de caracteres, que para nosotros forman una palabra.
	
		
		
		
		//variable objeto, nos permiten trabajar con métodos
		Integer numero3= 2;
		
		Long numero4 = 312931203103L; //con la L final o con el (long) convertimos de variable primitiva long a variable objeto LONG.
		Float numero5 = 59585859F; // igual que arriba
		
		
		//conversion a otro tipo de datos numericos
		
		
		//parseInt = retorna un número primitivo
		// valueOf = retorna un objeto número
		
		
		//**************************************************
		Boolean presente = false;
		

	}

}
