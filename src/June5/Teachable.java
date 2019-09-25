package June5;

//interface is an abstract type
public interface Teachable {
	
	//as of java 7
	//interface can only havre CONSTANT and abstract method
	
	public static final boolean STUDY_HARD = true;
	//any field you have AUTOMATICALLY PUBLIC STATIC FINAL
	String SCHOOL = "CyberTek";
	
	//public abstract void canLearn();
	void canLearn();
	//Any method without body or access modifier
	// it is automatically public and abstract
	
	public abstract void doHomeWork();
	
	

}
