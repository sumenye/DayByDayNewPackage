package June9;

public interface Drawable {
	
	String DRAWING_TOOL = "PEN";
	
	void draw();
	
	public default void drawLine(int n) {
		
	}
	public static void printDrawingTool(int n) {
	System.out.println("DRAWING N "+n+"LINE");	
	}
	
	//YOU CAN USE MAIN METHOD IN INTERFACE BUT NEVER EVER DO IT
	//IT IS NOT RECOMMENDED
//	public static void main(String[] args) {
//		
//	}

}
