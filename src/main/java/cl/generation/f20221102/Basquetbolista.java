package cl.generation.f20221102;

public class Basquetbolista extends EquipoBasquetbol {
	
	private Float altura;
	private Float peso;
	
	public Basquetbolista() {
		super();
	}

	public Basquetbolista(Float altura, Float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	@Override
	
	public void metodoImprimir() { 
		System.out.println("Estoy en el método de la clase hija entrenador");
	}
	
	

}
