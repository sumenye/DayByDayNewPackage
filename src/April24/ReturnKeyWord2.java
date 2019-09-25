package April24;

public class ReturnKeyWord2 {

	public static void main(String[] args) {

		ageTester(25);
		ageTester(15);

	}

	public static void ageTester(int age) {
		if (age < 18) {
			System.out.println("not adult");
			return;
		}
		System.out.println("go to work");
		System.out.println("get paid");
		System.out.println("pay your bill");

	}
}
