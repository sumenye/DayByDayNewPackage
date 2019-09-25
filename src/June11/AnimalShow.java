package June11;

public class AnimalShow {
	
	public static void main(String[] args) {
		
		
		
		//Cat is a Cat
		Cat c1 = new Cat();
		//Cat is an Animal
		//Animal a1 = new Cat();
		//Cat is an Indoorpet
		IndoorPet i1 = new Cat();
		c1.makeNoise();
		//Animal is a Cat ---> NOT VALID
		//Cat a2 = new animal();
		Animal a1 = c1;
		//Can a1 point to different animal obj?
		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		new Dog().makeNoise();
		
		Animal x1 = new Dog();
		Animal x2 = new Cat();
		Animal x3 = new Horse();
	
		
		
		
	}
	

}
