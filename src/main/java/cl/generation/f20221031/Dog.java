package cl.generation.f20221031;

public class Dog { //when I create an instance of a type, 
	               // basically a blueprint for an object. 
	
	public String name; //private ensures that name and age are only accessible through this class
	public int age;
	
	
	public Dog (String name, int age) { //meaning that once we create a DOG object, we need to pass it a name and age.
		this.name = name; //referencing the attributes of the class
		this.age = age;
		// add2();
	}
	
	public void speak() {
		System.out.println("I am " + this.name + " and I am "+ this.age + " years old");
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
		
	}
	
	/*private int add2() { //making it 'private' we make it usable only within the Dog class
		return this.age + 2; 
	}*/
	
	
	

}
