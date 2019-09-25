package June5;

//IMPLEMENTING AN INTERFACE ALSO BUILDING A PARENT CHILD RELATIONSHIP
//WE USE IMPLEMENTS KEYWORD RATHER THAN EXTENDS used by a class
//the class must implement every abstract method

public class OnlineStudent implements Teachable{

	@Override
	public void canLearn() {
		System.out.println("can learn by hardwork");
		
	}

	@Override
	public void doHomeWork() {
		System.out.println("will do all homeworks");
			
	}

	public static void main(String[] args) {
		System.out.println(Teachable.STUDY_HARD);
		System.out.println(STUDY_HARD);//inherited the static variable so can use directly
		
		OnlineStudent s = new OnlineStudent();
		s.canLearn();
		s.doHomeWork();
		
	}

}
