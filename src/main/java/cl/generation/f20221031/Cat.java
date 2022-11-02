package cl.generation.f20221031;

public class Cat extends Dog{
	
	private int food;
	public Cat(String name, int age, int food) { //it is gonna grab everything from the Dog class and apply it here.
		  // Dog ends up being our superclass and Cat our subclass
		super(name, age);
		this.food = food;
		
	} 
	
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50; //default parameter since i'm not asking for it inside the parameters.
	}
	
	public Cat(String name) {
		super(name, 0);
		this.food = 50;
	}
	
	public void speak() { //overwriting the previous method in the Dog class
		System.out.println("Meow my name is " + this.name + " and I get fed" + this.food + "grams a day");
	}
	
	public void eat(int x) {
		this.food -= x;
	}
	
	

}
