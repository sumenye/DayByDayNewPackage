package May25;

public class AdminUser extends SlackUser{
	int adminLevel;
	
public AdminUser(String displayName, int timeZone, String status, int adminLevel) {
	this.displayName = displayName;
	this.status = status;
	this.timeZone=timeZone;	
	this.adminLevel = adminLevel;
}

@Override
public String toString() {
	return "AdminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timeZone=" + timeZone
			+ ", status=" + status + "]";
}

}
/*
 * TASK 1 
Create classes as below 
SlackUser
  displayName as String
  timezone as int
  status as String
constructor --
  no arg
  3 args to set All fields value
  sendMessage  
    have one parameter as message and has no return type
    print --- <displayName> is sending<Message>
  changeStatus
    accept one String as parameter and change status to new status
2 sub classes :
StudentUser
  groupNumber as int 
  
  Create a 4 args constructor to set all field values of StudentUser
  
  // generate toString method so we can print out object directly 
Optional : 
AdminUser
  adminLevel as int 
 
  Create a 4 args constructor to set all field values of AdminUser
  // generate toString method so we can print out object directly 
 * */
