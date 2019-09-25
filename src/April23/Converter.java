package April23;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultInCm= meterToCM(9);
		System.out.println(resultInCm);
		System.out.println(feetToInch(5.6));
		System.out.println(faToCelcius(76));

	}
	public static int meterToCM(int meter) {
	return meter*100;
	
	}
	
	public static double feetToInch(double feet) {
		return feet*12;
		
		}
	public static double faToCelcius(double fahtemp) {
		return (fahtemp - 32) * 5/9;
		
		}
	}


