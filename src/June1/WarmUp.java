package June1;

public class WarmUp {
	int num = 100;
	
	{
		num=150;//THIS INSTANCE BLOCK IS CALLED IN EVERY CONSTRUCTOR
		System.out.println("init block 1");
	}
	{
		System.out.println("init block 2");
	}

	public WarmUp() {
		//num=150;
		//System.out.println("init block 1");
		//System.out.println("init block 2");
		num=200;
		
	}
	public WarmUp(int x) {
		//num=150;
		//System.out.println("init block 1");
		//System.out.println("init block 2");
		num=400;
	}
	
	public static void main(String[] args) {
		
		WarmUp w = new WarmUp();
		
	System.out.println(w.num);
	
	}

}
