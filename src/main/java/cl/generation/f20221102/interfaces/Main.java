package cl.generation.f20221102.interfaces;

public class Main {
	
	/* LAS CLASES ABSTRACTAS NO SE PUEDEN IMPLEMENTAR O INSTANCIAR */

	public static void main(String[] args) {
		// Interfaces y clases abstractas
		
		
		
		//NO se pueden instanciar clases abstractas.
		//Animal animal = new Animal();
		
		Caballo caballo = new Caballo();
		caballo.setAltura(2.5f);
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		Leon leon = new Leon();
		
		leon.setAltura(0.80f);
		leon.setPeso(200f);
		
		//imprimir valores seteados
		
		System.out.println(leon.getAltura());
		System.out.println(leon.getPeso());
		System.out.println(leon.toString());
		//imprimir que come carne
		leon.metodoEnAnimal();
		
		Persona persona = new Persona();
		
		persona.setDni(null);

	}

}
