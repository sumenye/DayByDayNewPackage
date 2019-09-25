package June9;

public abstract class Shape implements Drawable{
	
	String color;

	
	public abstract double calculateArea();
	
	public abstract String toString();
	
	public static void main(String[] args) {
		
		
	System.out.println(Drawable.DRAWING_TOOL);	
	System.out.println(Shape.DRAWING_TOOL);	
	System.out.println(DRAWING_TOOL);	
		
	}
	
	//BELOW ARE THE ONES THAT WE ALREADY HAVE
//	String DRAWING_TOOL = "PEN";
//	
//	void draw();
//	
//	public default void drawLine(int n) {
//		
//	}
//	public static void printDrawingTool(int n) {
//	System.out.println("DRAWING N "+n+"LINE");	
//	}
	


		
	}


