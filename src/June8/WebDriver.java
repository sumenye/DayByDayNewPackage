package June8;

import java.util.ArrayList;

public interface WebDriver {

	String PURPOSE = "Automating Browser";//implicitly ===> public static final
	
	void openBrowser();//implicitly ===>  public abstract
	void navigateTo(String Url);//implicitly ===>  public abstract
	void quit();//implicitly ===>  public abstract
	String findElementByID(int id);//implicitly ===>  public abstract
	ArrayList<String> findElementByTagName(String tagName);//implicitly ===>  public abstract
	
}
