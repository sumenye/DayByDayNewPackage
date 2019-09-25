package June1;

public class AccessingStaticMemberWithNullObject {

	public static void main(String[] args) {
		
SoccerFinal s1 = new SoccerFinal();
s1.printScore();
s1.printcupName();

SoccerFinal s2 = null;
s2.printScore();
s2.printcupName();
System.out.println(s2.cupName);
System.out.println(s2);
System.out.println(SoccerFinal.cupName);

	}

}
