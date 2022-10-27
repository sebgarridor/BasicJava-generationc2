package cl.generation.f20221027;

public class Paciente {

	  private String nombre;
	  private String apellido;
	  private String direccion;
	  private Integer telefono;
	  private String correo;
	  
	  
	  //Constructor
		public Paciente() {
			super();
		}
	  
	  public Paciente(String nombre, String apellido, String direccion, Integer telefono, String correo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.direccion = direccion;
			this.telefono = telefono;
			this.correo = correo;
		}
	  
	  //getters y setters
	  
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
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public Integer getTelefono() {
			return telefono;
		}
		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
	  
	  	@Override
	  	public String toString() {
			return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono="
					+ telefono + ", correo=" + correo + "]";
		}

}
