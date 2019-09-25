package May8;

public class Teacher {
	private String name;
	private String specialty;
	
	//getters and setters
	//getter methid is just like any ither methids
	//it is specifically for getting the fields value
	//and returning it from the method
	//it accepts no parameter
	
	public String getName() {
		return name;
	}

	//setter method is just like any other method
	//it is specifically for setting/updating the field value
	//it accept one parameter so we can pass the new value
	//and return nothing
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String newSpecialty) {
		specialty = newSpecialty;
	}
}
