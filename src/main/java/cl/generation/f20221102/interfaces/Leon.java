package cl.generation.f20221102.interfaces;

public class Leon extends Carnivoro implements Generico{

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		System.out.println("El leon come carne");
		
	}
	
	@Override
	public void metodoEnAnimal() {
		System.out.println("El leon come carne");
		
	}

	@Override
	public String toString() {
		return "Leon [getPeso()=" + getPeso() + ", getAltura()=" + getAltura() + "]";
	}

}
