package June1;

public class ProgrammingLanguage extends Language{

	
	public static void main(String[] args) {
		
	}
//@Override
//public void obeyGrammaRule() {
//System.out.println("MUST OBEY THE SYNTAX RULE, are you sure");	
//super.obeyGrammaRule();
//}
	
}


class Language{
	

public void obeyGrammaRule() {
	System.out.println("MUST OBEY THE SYNTAX RULE");
}
public final static void display() {
	System.out.println("display language");
}
}
