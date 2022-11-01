package cl.generation.f20221031;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog seb = new Dog("seb", 5);
		seb.speak();
		
		Dog bes = new Dog("bes", 2);
		bes.speak();
		
		Dog ebs = new Dog("ebs", 9);
		ebs.speak();
		
		Dog sbe = new Dog("sbe", 6);
		sbe.speak();
		
		seb.setAge(10);
		seb.speak();
		
		
		Cat catseb = new Cat("catseb", 3, 100);
		catseb.speak();

	}
	
	

}
