package cl.generation.f20221102ejercicio;

public class Colegio {
	private String nombre;
	private String apellido;
	private int edad;
	private String correo;
	
	public Colegio() {
		super();
	}
	
	public Colegio(String nombre, String apellido, int edad, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo + "]";
	}
	
	
	
	
}