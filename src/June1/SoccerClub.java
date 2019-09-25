package June1;

public class SoccerClub {
	

	// HAS-A RELATIONSHIP CAN BE BUILD USING INSTANCE VARIABLE WITH REFERENCE TYPE
	// WHEN SoccerClub define has-a relationship with 
	//   Stadium by putting Stadium as instance variable 
	// it has access to everything  visible that Stadium object can have 

	// WHAT DO WE CALL HAS-A RELATIONSHIP COMPARED TO INHERITANCE FOR IS-A 
	// COMPOSITION 

	int playerCount;
	String name;
	
	Stadium st;
	
	

	public SoccerClub(int playerCount, String name, Stadium stadium) {
		//super();
		this.playerCount = playerCount;
		this.name = name;
		this.st = stadium;
	}

	
	public char getInitial() {
		return name.charAt(0);
	}
	public int getStadiumCapacity() {
		return st.capacity;
	}

	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + st + "]";
	}
	
	
	public static void main(String[] args) {
		SoccerClub favourite = new SoccerClub(13, "VodafoneArena", new Stadium(15000,"french fries"));
		
		Stadium st1 = new Stadium(10000,"Burger");
		SoccerClub chelsea = new SoccerClub(25, "Chelsea", st1);
		System.out.println(chelsea.getInitial());
		System.out.println(st1.toString());
		System.out.println(chelsea);
		
		
	}
	
	
}
