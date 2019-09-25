package May18;

public class FlyingCars {
	// * Design pattern
	// * -- set of common programming pratices to solve certain problems
	// *
	// * Singleton Patterns
	// * --> a pattern to make sure single instance of object is created
	// * during entire entire runtime of the application

	String name;
	private static FlyingCars fcar;
	
	
	//private FlyingCars() {
	public FlyingCars() {
	}

	public static FlyingCars getInstance() {

		FlyingCars f1 = new FlyingCars();
		return f1;

	}
}
