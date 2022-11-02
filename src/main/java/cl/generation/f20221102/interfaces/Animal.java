package cl.generation.f20221102.interfaces;

public abstract class Animal { //con la palabra reservada 'abstract' indicamos que es una clase abstract
	private float peso;
	private float altura;
	
	public Animal() {
		super();
	}

	public Animal(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	/*public void metodoEnAnimal() {
		System.out.println("Estoy en el método de animal"); //ESTO ES IMPLEMENTACIÓN: DENTRO DEL MÉTODO ESTOY REALIZANDO ALGO.
	}*/
	
	public abstract void metodoEnAnimal(); //solo estoy definiendo el método: que será público, que no va a retornar nada, no recibe ningún parámetro y sellama metodoEnAnimal.

}
