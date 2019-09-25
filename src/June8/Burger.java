package June8;

public class Burger implements Edible{
	String name;
	char size;
	
	public Burger(String food, char size) {
		this.name = name;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}
	public void eat() {
		System.out.println("eating Burger");		
	}


}
