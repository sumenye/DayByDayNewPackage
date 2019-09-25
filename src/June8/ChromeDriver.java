package June8;

import java.util.ArrayList;

public class ChromeDriver implements WebDriver{
	
	int screenSize;
	double positionx;
	public ChromeDriver(int screenSize, double positionx) {
		this.screenSize = screenSize;
		this.positionx = positionx;
	}
	
	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver(52,100 );
		System.out.println(d1.positionx);
		d1.quit();
	}
	
	public void openBrowser() {
		System.out.println("opening browser");
	}
	
	public void navigateTo(String Url) {
		System.out.println("navigating to url: "+Url);
	}
	
	public void quit() {
		System.out.println("closing browser");
	}
	public String findElementByID(int id) {
		System.out.println("looking for element hard with id"+id);
	return "my element";	
	}
	public ArrayList<String> findElementByTagName(String tagName){
	return null;	
	}

}
