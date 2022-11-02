package cl.generation.f20221102;

public class Entrenador extends EquipoBasquetbol { //extends es una palabra reservada para heredar

	private int aniosExperiencia;
	private String equipo;
	
	
	public Entrenador() {
		super();
	}


	public Entrenador(int aniosExperiencia, String equipo) {
		super();
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}


	public Entrenador(String nombre, String apellido, int edad, int aniosExperiencia, String equipo) { //AQUI CAPTURAMOS TODOS LOS ATRIBUTOS (HEREDADOS Y PROPIOS)
		super(nombre, apellido, edad); //captura el nombre, apellido y edad, y se los pasa al padre EquipoBasquetbol
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}


	public int getAniosExperiencia() {
		return aniosExperiencia;
	}


	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	@Override
	public String toString() {
		return "Entrenador [aniosExperiencia=" + aniosExperiencia + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
/*	
	@Override
	public void metodoImprimir() { 
		System.out.println("Estoy en el método de la clase hija entrenador");
	} */



}
