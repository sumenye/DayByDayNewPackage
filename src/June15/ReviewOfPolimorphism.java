package June15;

import June11.*;

public class ReviewOfPolimorphism {
	
	Object o = new Dog();
	Object o1 = new Animal();
	Object o2 = new Object();
	
	Animal d1 = (Animal)o1;
	Dog d2 = (Dog)o;
	
	//Shape s = new Circle();
	//Square sq = (Square) s; ---> COMPILES BUT IN EXECUTION ---->>//CLASSCAST EXEPTION*****
	//
	
	
	
	/*ability of object to take multiple form
	ability of object to be referred by it's super type
	and take that object specific action at run time
	
	Animal a = new Dog();
		a.makeNoise();
		a=new Cat();
		a.makeNoise;
		
		Animal makeNoise ---> woof, Cat, miao
				
		List<String> lst = new ArrayList<>();
		
		It provide flexibility
		
		we can group objects together by it's general type
		
		Animal[] animals = {new Dog() ,. new Cat() , new Horse() };
	
	Method parameters :
	for example:
	public void AnimalNoiseTester(Animal anyAnimal){
	
	}
	
	//What argument we can pass to above method
	 * AnimaNoiseTester( new Dog()  );
	 * AnimalNoiseTester( new Cat()  );
	 * 
	 * Return Type
	 * public static Animal getMyAnimal(){
	 * return ---->> new Dog()  or new Cat()  or new Horse();
	 * }
	 * 
	//each class in java implicitly extend Object if not already extending another class
	 //interface does not have this concept
	  * 
	  * 
	  * 
	  * WebDriver driver = new ChromeDriver();
	  what decide what member can be accessible using the reference variable
	  ---> ONLY REFERENCE TYPE
	  
	  Animal a = new Dog();
	  a can access only the members that visible to the Animal type
	  a.makeNoise()----->
	  
	  
	  
	  
	  *
	  *
	  *
	  */

}
