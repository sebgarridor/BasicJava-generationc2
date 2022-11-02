package cl.generation.f20221102.interfaces;



/* EXTEND = HERENCIA
 * IMPLEMENTS = IMPLEMENTA
 */
public class Humano extends Omnivoro implements Generico{ //que yo herede de una clase abstracta no me hace una clase abstracta.
	private boolean razonamiento;

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public Humano() {
		super();
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void respirar() { //Implementamos los métodos de la interfaz 'Generico' donde solo definimos los métodos
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		System.out.println("El humano come de todo");
		
	}

	
}
