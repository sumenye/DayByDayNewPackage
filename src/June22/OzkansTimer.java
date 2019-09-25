package June22;

public class OzkansTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		timer(5);

	}
public static void timer(int time) {
		
		
		
		for(int i = time - 1; i >= 0; i--) {
			
			for(int j = 60; j >= 0; j--) {
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){//this is fully checked exception. must be thrown 
					System.out.println(e);    //in the try block before it is used in catch
					}
				System.out.println(i + " minutes and " + j + " seconds left");
			}
			
		}
		System.out.println("Dang!");

		}

}
