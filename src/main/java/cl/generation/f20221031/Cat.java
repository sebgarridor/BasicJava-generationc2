package cl.generation.f20221031;

public class Cat extends Dog{
	
	private int food;
	public Cat(String name, int age, int food) { //it is gonna grab everything from the Dog class and apply it here.
		  // Dog ends up being our superclass and Cat our subclass
		super(name, age);
		this.food = food;
		
	} 
	
	public void speak() {
		System.out.println("Meow my name is " + this.name + " and I get fed" + this.food + "grams a day");
	}
	

}
