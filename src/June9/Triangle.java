package June9;

public class Triangle extends Shape {
	int height;
	int base;
	
	//String color;

	public Triangle(String color, int height, int base) {
		this.color = color;
		this.height = height;
		this.base = base;
	}
	
	public double calculateArea() {
		return base*height/2;
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
	System.out.println("DRAWING TRIANGLE");
	}

}
