package May25;

public class SlackUser {
String displayName;
int timeZone;
String status;

public SlackUser() {
	System.out.println("Slack User with no args");
}
public SlackUser(String displayName, int timeZone, String status) {
	this.displayName = displayName;
	this.status = status;
	this.timeZone=timeZone;	
}
public void sendMessage(String message) {
	System.out.println(displayName +" is sending this message: "+message);
}
public void changeStatus(String status) {
	this.status=status;
}
}
