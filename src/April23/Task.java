package April23;

public class Task {

	public static void main(String[] args) {

		long firstYearSalary = giveme6DigitSalary();
		//long secondYearSalary = giveme6DigitSalary();
		//SECOND YEAR SALARY RAISE %10
		long  secondYearSalary = (long) (firstYearSalary * 1.1);
		System.out.println(firstYearSalary + secondYearSalary);
		System.out.println(giveme6DigitSalary() + giveme6DigitSalary());
		//-----------OR------------------
		System.out.println(giveme6DigitSalary()*2);
	}

	public static long giveme6DigitSalary() {

		return 180000L;
	}

}
