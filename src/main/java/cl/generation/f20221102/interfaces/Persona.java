package cl.generation.f20221102.interfaces;

public class Persona extends Humano{
	
	
	/* Atributos
	 * Altura
	 * Peso
	 * Razonamiento
	 */
	 
	/*Metodos
	 * metodoEnAnimal
	 * respirar
	 * comer
	 */
	
	private String dni;

	public Persona(boolean razonamiento, String dni) {
		super(razonamiento);
		this.dni = dni;
	}

	public Persona(boolean razonamiento) {
		super(razonamiento);
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}



}
