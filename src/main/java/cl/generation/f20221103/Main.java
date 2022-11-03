package cl.generation.f20221103;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Objetos de colaboracion
		
		Usuario usuario = new Usuario();
		/*ArrayList<String> telefonos = new ArrayList<String>();
		telefonos.add("3232323");
		telefonos.add("3283838");
		telefonos.add("8199194");
		
		
		usuario.setTelefonos(telefonos);
		System.out.println(usuario.getTelefonos());*/
		
		usuario.getTelefonos().add("3939399"); //nos permite usar el setter para agregar datos al arraylist ya creado en Usuario
		usuario.getTelefonos().add("3213399");
		usuario.getTelefonos().add("42149399");
		usuario.getTelefonos().add("424939399");
		System.out.println(usuario.getTelefonos());
		
		/* usuario.setDireccion("pajaritos 1425, santiago, metropolitana");
		
		Usuario usuario2 = new Usuario();
		usuario2.setDireccion("alameda 12012, santiago"); */
		Direccion direccion = new Direccion();
		direccion.setCalle("Pajaritos");
		direccion.setNumero("1245");
		direccion.setCiudad("Santiago");
		direccion.setRegion("Metropolitana");
		
		usuario.setDireccion(direccion);
		System.out.println(usuario.getDireccion().toString());
	}
	

}
