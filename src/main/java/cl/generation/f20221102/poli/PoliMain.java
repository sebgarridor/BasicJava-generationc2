package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo, para que exista el polimorfismo debe existir HERENCIA(jerarquía de clases)
		
		
		//Creación de instancia de las clases
		
		Mascotas mascota = new Mascotas();
		mascota.emitirSonido();
		
		Perro dog = new Perro();
		dog.emitirSonido();
		
		Gato venus = new Gato();
		venus.emitirSonido();
		
		
		/******************/
		System.out.println("");
		Mascotas regalon = new Perro(); //una clase como comporta como la otra, pero NO ES LA OTRA.!!!
		regalon.emitirSonido();//solo le puedo atribuir los datos de la clase PADRE, puedo ir al método pero no a los atributos.
		System.out.println(regalon.toString());
		
		Mascotas michi = new Gato();
		michi.emitirSonido();
		
		/* POLIMORFISMO PARAMÉTRICO -> EL MÉTODO SE ESCRIBE IGUAL PERO RECIBE DISTINTOS PARÁMETROS. ej: mi abuelo se pone mi ropa, se viste como yo pero no es YO.*/
		
		
		michi.horaSiesta(19);
		
		Perro dog2 = (Perro) regalon; // entre paréntesis va el casteo.
		

	}

}
