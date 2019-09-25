package June15;

import June11.IndoorPet;

public class Cat extends Animal implements IndoorPet {
	  
	  public String legsCount = "cat leg" ; 
	  @Override
	  public void makeNoise() {
	    System.out.println("MIA MIAO");
	  }
	}