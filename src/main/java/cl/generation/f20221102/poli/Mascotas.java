package cl.generation.f20221102.poli;

public class Mascotas {
	private String raza;
	private String nombre;
	private String sexo;
	
	//Constructores
	public Mascotas() {
		super();
	}
	public Mascotas(String raza, String nombre, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
		
	}
	
	// Getter y setters
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Mascotas [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
	public void emitirSonido() {
		System.out.println("El sonido es ...");
	}
	//Polimorfismo paramétrico/SOBRECARGA DE MÉTODO
	public void horaSiesta() {
		System.out.println("La mascota no duerme");
	}
	
	public void horaSiesta(int horas) {
		System.out.println("La mascota duerme" + horas + " horas");
	}
	
	public void horaSiesta(float horas) {
		System.out.println("La mascota no duerme");
	}
	
	
	

}
