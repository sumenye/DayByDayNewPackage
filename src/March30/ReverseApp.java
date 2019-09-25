package March30;

public class ReverseApp {

	public static void main(String[] args) {
		
String app= "app";
String reversedApp = "";
reversedApp = reversedApp + app.charAt(2);
System.out.println(reversedApp);
reversedApp = reversedApp + app.charAt(1);
System.out.println(reversedApp);

reversedApp += app.charAt(0);
System.out.println(reversedApp);

//THIS IS WHAT WE DO IN WHILE LOOP
int x = 2;
while(x>=0){
	x--;
	System.out.println(x);
}

	}

}
