package June8;

public class IceCoffee implements Drinkable{
char size;
	
	public IceCoffee(char size) {
		this.size = size;
	}
	public void eat() {
	System.out.println("eating");	
	}
	public void drink() {
		System.out.println("drinking");	
	}
	@Override
	public String toString() {
		return "IceCoffee [size=" + size + "]";
	}

	public static void main(String[] args) {
		IceCoffee kahve = new IceCoffee('M');
		System.out.println(kahve.size);	
		System.out.println(kahve);
		kahve.drink();
		kahve.eat();
		
		Burger hungry = new Burger("noname",'L');
		System.out.println(hungry.size);	
		System.out.println(hungry);
		hungry.eat();
	}	
	

}
