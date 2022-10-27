package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase
		Auto auto1 = new Auto(); //no importamos nada debido a que están dentro del mismo package
								 //instancia de clases es la creación de una variable 'auto1' de tipo Auto.
								 // después del '=' estamos inicializando la variable
								 // en los paréntesis () está el constructor vacío de Auto.
								 //lo usamos para crear una instancia, pero todavía no sabemos los valores del auto
		
		auto1.text= "sdfj"; //podemos acceder a este valor ya que lo definimos como público
		/* auto1.color = "azul"; //a este no podemosa acceder ya que lo definimos como privado, la única manera de acceder es a través del método setter. */
		
		
		auto1.setColor("rojo"); // a través del set podemos asignarle un valor a la variable 'color'. esta variable la definimos dentro de los paréntesis string ("color")
		auto1.setMarca("Mercedes");
		
		//consultar el contenido los atributos
		
		auto1.getColor();
		System.out.println(auto1.getColor());
		
		
		
		
		
		//lo usamos para saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		// Nueva instancia de Auto, creación de una nueva referencia a un objeto
		
		Auto car = new Auto("Nissan", "Negro", "Qashqai", 1.6f, 10.0f, 240f); //aquí estoy agregando todos los atributos que ya tenía.
		System.out.println(car.getModelo());
		
		auto1.setRendimiento(8.0f);
		System.out.println(car.toString());

	}

}
