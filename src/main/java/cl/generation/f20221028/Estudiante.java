package cl.generation.f20221028;

public class Estudiante {
	//Atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String rut;
	private String curso;
	private String correo;
	
	//Constructores
	
	public Estudiante() { // Pudiese darse el caso que no tenga ningún dato del estudiante, también podría darse el caso de que sólo tenga unos datos.
		super();		  // este constructor vacío es para pasarle los datos después.
	}
	
	
	
	public Estudiante(String nombre, String apellido, Integer edad, String rut, String curso, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.curso = curso;
		this.correo = correo;
	}
	



	//Getters & setters

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}



	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut
				+ ", curso=" + curso + ", correo=" + correo + "]";
	}
	
	
	// Métodos
	
	

}
